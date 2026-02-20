package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DocumentDemandeDevisDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDevisFournisseur;
import fr.d4immobilier.visionapirest.entities.DocumentDemandeDevis;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:20+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class DocumentDemandeDevisMapperImpl implements DocumentDemandeDevisMapper {

    @Override
    public List<DocumentDemandeDevisDTO> toDTOList(List<DocumentDemandeDevis> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DocumentDemandeDevisDTO> list = new ArrayList<DocumentDemandeDevisDTO>( entities.size() );
        for ( DocumentDemandeDevis documentDemandeDevis : entities ) {
            list.add( toDTO( documentDemandeDevis ) );
        }

        return list;
    }

    @Override
    public DocumentDemandeDevisDTO toDTO(DocumentDemandeDevis entity) {
        if ( entity == null ) {
            return null;
        }

        DocumentDemandeDevisDTO documentDemandeDevisDTO = new DocumentDemandeDevisDTO();

        documentDemandeDevisDTO.setDemandeDevisFournisseurId( entityDemandeDevisFournisseurId( entity ) );
        documentDemandeDevisDTO.setId( entity.getId() );

        return documentDemandeDevisDTO;
    }

    @Override
    public DocumentDemandeDevis toEntity(DocumentDemandeDevisDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DocumentDemandeDevis documentDemandeDevis = new DocumentDemandeDevis();

        documentDemandeDevis.setId( dto.getId() );

        return documentDemandeDevis;
    }

    private Long entityDemandeDevisFournisseurId(DocumentDemandeDevis documentDemandeDevis) {
        if ( documentDemandeDevis == null ) {
            return null;
        }
        DemandeDevisFournisseur demandeDevisFournisseur = documentDemandeDevis.getDemandeDevisFournisseur();
        if ( demandeDevisFournisseur == null ) {
            return null;
        }
        Long id = demandeDevisFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
