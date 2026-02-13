#!/usr/bin/env python3
"""
Générateur automatique d'API REST pour les entités JPA - VERSION CORRIGÉE
"""

import os
import re
from pathlib import Path
from typing import List, Dict, Set

# Configuration
BASE_PACKAGE = "fr.d4immobilier.visionapirest"
ENTITIES_PATH = "src/main/java/fr/d4immobilier/visionapirest/entities"
OUTPUT_BASE = "src/main/java/fr/d4immobilier/visionapirest"

# Types Java standards (à ne pas traiter comme des enums)
JAVA_STANDARD_TYPES = {
    'String', 'Integer', 'Long', 'Double', 'Float', 'Boolean',
    'BigDecimal', 'BigInteger', 'LocalDate', 'LocalDateTime', 
    'LocalTime', 'Instant', 'Date', 'Timestamp', 'UUID', 'byte[]',  # ← Ajout de Instant
    'int', 'long', 'double', 'float', 'boolean', 'short', 'byte', 'char'
}

class Field:
    def __init__(self, name: str, type_name: str, is_collection: bool = False, 
                 is_relation: bool = False, relation_type: str = None):
        self.name = name
        self.type_name = type_name
        self.is_collection = is_collection
        self.is_relation = is_relation
        self.relation_type = relation_type

class Entity:
    def __init__(self, name: str, fields: List[Field]):
        self.name = name
        self.fields = fields
        self.simple_fields = [f for f in fields if not f.is_relation]
        self.relation_fields = [f for f in fields if f.is_relation]

def is_enum_type(type_name: str) -> bool:
    """Détermine si un type est probablement un enum"""
    # Un enum commence par une majuscule, n'est pas générique, et n'est pas un type Java standard
    return (type_name[0].isupper() and 
            '<' not in type_name and 
            type_name not in JAVA_STANDARD_TYPES)

def parse_entity_file(filepath: str) -> Entity:
    """Parse un fichier d'entité Java pour extraire les informations"""
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    
    # Extraire le nom de la classe
    class_match = re.search(r'public class (\w+)', content)
    if not class_match:
        return None
    
    entity_name = class_match.group(1)
    
    # Ignorer certaines classes utilitaires
    if entity_name in ['ContexteVision']:  # Ajoutez d'autres à ignorer si nécessaire
        return None
    
    # Extraire les champs
    fields = []
    
    # Pattern pour les champs avec annotations
    field_pattern = r'(@\w+[^\n]*\n\s*)*private\s+(\w+(?:<[\w\s,]+>)?)\s+(\w+);'
    
    for match in re.finditer(field_pattern, content):
        annotations = match.group(1) or ""
        field_type = match.group(2)
        field_name = match.group(3)
        
        # Ignorer les champs transient et static
        if 'transient' in annotations.lower() or 'static' in field_type.lower():
            continue
        
        # Détecter les collections
        is_collection = any(coll in field_type for coll in ['List<', 'Set<', 'Collection<'])
        
        # Détecter les relations JPA
        is_relation = any(rel in annotations for rel in 
                         ['@OneToOne', '@OneToMany', '@ManyToOne', '@ManyToMany'])
        
        relation_type = None
        if is_relation:
            for rel in ['@OneToOne', '@OneToMany', '@ManyToOne', '@ManyToMany']:
                if rel in annotations:
                    relation_type = rel
                    break
        
        fields.append(Field(field_name, field_type, is_collection, is_relation, relation_type))
    
    return Entity(entity_name, fields)

def generate_dto(entity: Entity) -> str:
    """Génère le code du DTO"""
    
    dto_code = f"""package {BASE_PACKAGE}.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public class {entity.name}DTO {{
    
    private Long id;
"""
    
    # Ajouter les champs simples
    for field in entity.simple_fields:
        if field.name != 'id':
            # Convertir les vrais enums en String
            if is_enum_type(field.type_name):
                dto_code += f"    private String {field.name}; // Enum converti en String\n"
            else:
                dto_code += f"    private {field.type_name} {field.name};\n"
    
    # Ajouter les IDs des relations ManyToOne et OneToOne
    for field in entity.relation_fields:
        if field.relation_type in ['@ManyToOne', '@OneToOne'] and not field.is_collection:
            dto_code += f"    private Long {field.name}Id;\n"
    
    dto_code += f"""
    // Constructeur
    public {entity.name}DTO() {{
    }}
    
    // Getters et Setters
    
    public Long getId() {{
        return id;
    }}
    
    public void setId(Long id) {{
        this.id = id;
    }}
"""
    
    # Générer getters/setters pour les champs simples
    for field in entity.simple_fields:
        if field.name != 'id':
            field_type = field.type_name
            # Convertir vrais enums en String
            if is_enum_type(field_type):
                field_type = "String"
            
            capitalized = field.name[0].upper() + field.name[1:]
            dto_code += f"""
    public {field_type} get{capitalized}() {{
        return {field.name};
    }}
    
    public void set{capitalized}({field_type} {field.name}) {{
        this.{field.name} = {field.name};
    }}
"""
    
    # Getters/setters pour les IDs de relations
    for field in entity.relation_fields:
        if field.relation_type in ['@ManyToOne', '@OneToOne'] and not field.is_collection:
            capitalized = field.name[0].upper() + field.name[1:]
            dto_code += f"""
    public Long get{capitalized}Id() {{
        return {field.name}Id;
    }}
    
    public void set{capitalized}Id(Long {field.name}Id) {{
        this.{field.name}Id = {field.name}Id;
    }}
"""
    
    dto_code += "}\n"
    
    return dto_code

def generate_mapper(entity: Entity) -> str:
    """Génère le code du Mapper MapStruct"""
    
    mapper_code = f"""package {BASE_PACKAGE}.mappers;

import {BASE_PACKAGE}.dto.{entity.name}DTO;
import {BASE_PACKAGE}.entities.{entity.name};
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface {entity.name}Mapper extends GenericMapper<{entity.name}, {entity.name}DTO> {{
    
    // Mapping de l'entité vers le DTO
"""
    
    # Ajouter les mappings pour les relations ManyToOne/OneToOne
    for field in entity.relation_fields:
        if field.relation_type in ['@ManyToOne', '@OneToOne'] and not field.is_collection:
            mapper_code += f'    @Mapping(source = "{field.name}.id", target = "{field.name}Id")\n'
    
    # Ajouter les mappings UNIQUEMENT pour les vrais enums
    enum_fields = [f for f in entity.simple_fields if is_enum_type(f.type_name) and f.name != 'id']
    
    for field in enum_fields:
        mapper_code += f'    @Mapping(source = "{field.name}", target = "{field.name}", qualifiedByName = "{field.name}ToString")\n'
    
    mapper_code += f"    {entity.name}DTO toDTO({entity.name} entity);\n\n"
    
    # Mapping du DTO vers l'entité (ignorer toutes les relations)
    mapper_code += "    // Mapping du DTO vers l'entité\n"
    for field in entity.relation_fields:
        mapper_code += f'    @Mapping(target = "{field.name}", ignore = true)\n'
    
    mapper_code += f"    {entity.name} toEntity({entity.name}DTO dto);\n"
    
    # Méthodes helper UNIQUEMENT pour les vrais enums
    if enum_fields:
        mapper_code += "\n    // Méthodes helper pour les enums\n"
        for field in enum_fields:
            mapper_code += f"""
    @Named("{field.name}ToString")
    default String {field.name}ToString({BASE_PACKAGE}.entities.{field.type_name} value) {{
        return value != null ? value.name() : null;
    }}
"""
    
    mapper_code += "}\n"
    
    return mapper_code

def generate_repository(entity: Entity) -> str:
    """Génère le code du Repository"""
    
    repo_code = f"""package {BASE_PACKAGE}.repositories;

import {BASE_PACKAGE}.entities.{entity.name};
import jakarta.ejb.Stateless;

@Stateless
public class {entity.name}Repository extends GenericRepository<{entity.name}, Long> {{
    
    @Override
    protected Class<{entity.name}> getEntityClass() {{
        return {entity.name}.class;
    }}
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}}
"""
    
    return repo_code

def pluralize(word: str) -> str:
    """Pluralise un mot (simpliste)"""
    # Règles basiques de pluralisation
    if word.endswith('s') or word.endswith('x') or word.endswith('z'):
        return word
    elif word.endswith('al'):
        return word[:-2] + 'aux'
    elif word.endswith('eau') or word.endswith('eu'):
        return word + 'x'
    else:
        return word + 's'

def generate_resource(entity: Entity) -> str:
    """Génère le code de la Resource REST"""
    
    # Nom de la resource au pluriel (en minuscule)
    resource_path = pluralize(entity.name.lower())
    
    resource_code = f"""package {BASE_PACKAGE}.resources;

import {BASE_PACKAGE}.dto.{entity.name}DTO;
import {BASE_PACKAGE}.entities.{entity.name};
import {BASE_PACKAGE}.mappers.{entity.name}Mapper;
import {BASE_PACKAGE}.mappers.GenericMapper;
import {BASE_PACKAGE}.repositories.{entity.name}Repository;
import {BASE_PACKAGE}.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/{resource_path}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class {entity.name}Resource extends GenericResource<{entity.name}, {entity.name}DTO, Long> {{
    
    @Inject
    private {entity.name}Repository repository;
    
    @Inject
    private {entity.name}Mapper mapper;
    
    @Override
    protected GenericRepository<{entity.name}, Long> getRepository() {{
        return repository;
    }}
    
    @Override
    protected GenericMapper<{entity.name}, {entity.name}DTO> getMapper() {{
        return mapper;
    }}
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}}
"""
    
    return resource_code

def scan_entities(entities_path: str) -> List[Entity]:
    """Scanne tous les fichiers d'entités"""
    entities = []
    
    for java_file in Path(entities_path).glob("*.java"):
        print(f"📖 Analyse de {java_file.name}...")
        entity = parse_entity_file(str(java_file))
        if entity:
            entities.append(entity)
            print(f"   ✅ {entity.name} : {len(entity.simple_fields)} champs simples, {len(entity.relation_fields)} relations")
    
    return entities

def generate_all(entities: List[Entity], output_base: str):
    """Génère tous les fichiers pour toutes les entités"""
    
    # Créer les répertoires de sortie
    dto_dir = Path(output_base) / "dto"
    mapper_dir = Path(output_base) / "mappers"
    repo_dir = Path(output_base) / "repositories"
    resource_dir = Path(output_base) / "resources"
    
    dto_dir.mkdir(parents=True, exist_ok=True)
    mapper_dir.mkdir(parents=True, exist_ok=True)
    repo_dir.mkdir(parents=True, exist_ok=True)
    resource_dir.mkdir(parents=True, exist_ok=True)
    
    for entity in entities:
        print(f"\n✨ Génération pour {entity.name}...")
        
        # Générer DTO
        dto_path = dto_dir / f"{entity.name}DTO.java"
        with open(dto_path, 'w', encoding='utf-8') as f:
            f.write(generate_dto(entity))
        print(f"   ✅ DTO créé")
        
        # Générer Mapper
        mapper_path = mapper_dir / f"{entity.name}Mapper.java"
        with open(mapper_path, 'w', encoding='utf-8') as f:
            f.write(generate_mapper(entity))
        print(f"   ✅ Mapper créé")
        
        # Générer Repository
        repo_path = repo_dir / f"{entity.name}Repository.java"
        with open(repo_path, 'w', encoding='utf-8') as f:
            f.write(generate_repository(entity))
        print(f"   ✅ Repository créé")
        
        # Générer Resource
        resource_path = resource_dir / f"{entity.name}Resource.java"
        with open(resource_path, 'w', encoding='utf-8') as f:
            f.write(generate_resource(entity))
        print(f"   ✅ Resource créée : /{pluralize(entity.name.lower())}")

def main():
    print("🚀 Générateur d'API REST pour entités JPA (VERSION CORRIGÉE)")
    print("=" * 70)
    
    # Scanner les entités
    print(f"\n📂 Scan de {ENTITIES_PATH}...\n")
    entities = scan_entities(ENTITIES_PATH)
    print(f"\n📊 {len(entities)} entités trouvées et analysées\n")
    
    # Afficher la liste
    print("Entités à générer :")
    for entity in entities:
        enum_count = len([f for f in entity.simple_fields if is_enum_type(f.type_name)])
        print(f"  • {entity.name} ({len(entity.simple_fields)} champs, {len(entity.relation_fields)} relations, {enum_count} enums)")
    
    # Demander confirmation
    print("\n" + "=" * 70)
    response = input(f"Voulez-vous générer le code pour ces {len(entities)} entités ? (o/n) : ")
    
    if response.lower() != 'o':
        print("❌ Génération annulée")
        return
    
    print("\n🔧 Génération en cours...\n")
    
    # Générer tout
    generate_all(entities, OUTPUT_BASE)
    
    print("\n" + "=" * 70)
    print(f"✅ Génération terminée pour {len(entities)} entités !")
    print("\n📋 Prochaines étapes :")
    print("  1. Vérifiez les fichiers générés dans NetBeans")
    print("  2. Clean and Build le projet")
    print("  3. Vérifiez les erreurs de compilation")
    print("  4. Testez les endpoints : http://localhost:8080/visionapirest/api/[entité]s")
    print("\n💡 Astuce : Commencez par tester quelques entités simples avant tout déployer")

if __name__ == "__main__":
    main()