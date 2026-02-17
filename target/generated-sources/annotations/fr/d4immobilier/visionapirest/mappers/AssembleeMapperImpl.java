package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AssembleeDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.Bordereau;
import fr.d4immobilier.visionapirest.entities.Fichier;
import fr.d4immobilier.visionapirest.entities.FichierTrameRARConvoc;
import fr.d4immobilier.visionapirest.entities.FichierTrameRARDiffusion;
import fr.d4immobilier.visionapirest.entities.PVAG;
import fr.d4immobilier.visionapirest.entities.TypeTantieme;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class AssembleeMapperImpl implements AssembleeMapper {

    @Override
    public List<AssembleeDTO> toDTOList(List<Assemblee> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AssembleeDTO> list = new ArrayList<AssembleeDTO>( entities.size() );
        for ( Assemblee assemblee : entities ) {
            list.add( toDTO( assemblee ) );
        }

        return list;
    }

    @Override
    public AssembleeDTO toDTO(Assemblee entity) {
        if ( entity == null ) {
            return null;
        }

        AssembleeDTO assembleeDTO = new AssembleeDTO();

        assembleeDTO.setPvagId( entityPvagId( entity ) );
        assembleeDTO.setTypeTantiemeId( entityTypeTantiemeId( entity ) );
        assembleeDTO.setFichierMaquetteId( entityFichierMaquetteId( entity ) );
        assembleeDTO.setFichierTrameRARConvocId( entityFichierTrameRARConvocId( entity ) );
        assembleeDTO.setBordereauConvocId( entityBordereauConvocId( entity ) );
        assembleeDTO.setBordereauDiffusionId( entityBordereauDiffusionId( entity ) );
        assembleeDTO.setFichierRARCSVConvocId( entityFichierRARCSVConvocId( entity ) );
        assembleeDTO.setFichierRARCSVDiffusionId( entityFichierRARCSVDiffusionId( entity ) );
        assembleeDTO.setFichierTrameRARDiffusionId( entityFichierTrameRARDiffusionId( entity ) );
        assembleeDTO.setFichierTableExterneConvocationId( entityFichierTableExterneConvocationId( entity ) );
        assembleeDTO.setFichierTableExterneDiffusionId( entityFichierTableExterneDiffusionId( entity ) );
        assembleeDTO.setFichierFicheTravauxId( entityFichierFicheTravauxId( entity ) );
        assembleeDTO.setDateAssemblee( dateAssembleeToString( entity.getDateAssemblee() ) );
        assembleeDTO.setDateFinAssemblee( dateFinAssembleeToString( entity.getDateFinAssemblee() ) );
        assembleeDTO.setId( entity.getId() );
        assembleeDTO.setLieu( entity.getLieu() );
        assembleeDTO.setExtraordinaire( entity.getExtraordinaire() );
        assembleeDTO.setDateAGProvisoire( entity.getDateAGProvisoire() );
        assembleeDTO.setFormulairesExclusivement( entity.getFormulairesExclusivement() );
        assembleeDTO.setCorbeille( entity.getCorbeille() );

        return assembleeDTO;
    }

    @Override
    public Assemblee toEntity(AssembleeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Assemblee assemblee = new Assemblee();

        assemblee.setId( dto.getId() );
        if ( dto.getDateAssemblee() != null ) {
            assemblee.setDateAssemblee( Instant.parse( dto.getDateAssemblee() ) );
        }
        assemblee.setLieu( dto.getLieu() );
        if ( dto.getDateFinAssemblee() != null ) {
            assemblee.setDateFinAssemblee( Instant.parse( dto.getDateFinAssemblee() ) );
        }
        assemblee.setExtraordinaire( dto.getExtraordinaire() );
        assemblee.setDateAGProvisoire( dto.getDateAGProvisoire() );
        assemblee.setFormulairesExclusivement( dto.getFormulairesExclusivement() );
        assemblee.setCorbeille( dto.getCorbeille() );

        return assemblee;
    }

    private Long entityPvagId(Assemblee assemblee) {
        if ( assemblee == null ) {
            return null;
        }
        PVAG pvag = assemblee.getPvag();
        if ( pvag == null ) {
            return null;
        }
        Long id = pvag.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityTypeTantiemeId(Assemblee assemblee) {
        if ( assemblee == null ) {
            return null;
        }
        TypeTantieme typeTantieme = assemblee.getTypeTantieme();
        if ( typeTantieme == null ) {
            return null;
        }
        Long id = typeTantieme.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierMaquetteId(Assemblee assemblee) {
        if ( assemblee == null ) {
            return null;
        }
        Fichier fichierMaquette = assemblee.getFichierMaquette();
        if ( fichierMaquette == null ) {
            return null;
        }
        Long id = fichierMaquette.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierTrameRARConvocId(Assemblee assemblee) {
        if ( assemblee == null ) {
            return null;
        }
        FichierTrameRARConvoc fichierTrameRARConvoc = assemblee.getFichierTrameRARConvoc();
        if ( fichierTrameRARConvoc == null ) {
            return null;
        }
        Long id = fichierTrameRARConvoc.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityBordereauConvocId(Assemblee assemblee) {
        if ( assemblee == null ) {
            return null;
        }
        Bordereau bordereauConvoc = assemblee.getBordereauConvoc();
        if ( bordereauConvoc == null ) {
            return null;
        }
        Long id = bordereauConvoc.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityBordereauDiffusionId(Assemblee assemblee) {
        if ( assemblee == null ) {
            return null;
        }
        Bordereau bordereauDiffusion = assemblee.getBordereauDiffusion();
        if ( bordereauDiffusion == null ) {
            return null;
        }
        Long id = bordereauDiffusion.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierRARCSVConvocId(Assemblee assemblee) {
        if ( assemblee == null ) {
            return null;
        }
        Fichier fichierRARCSVConvoc = assemblee.getFichierRARCSVConvoc();
        if ( fichierRARCSVConvoc == null ) {
            return null;
        }
        Long id = fichierRARCSVConvoc.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierRARCSVDiffusionId(Assemblee assemblee) {
        if ( assemblee == null ) {
            return null;
        }
        Fichier fichierRARCSVDiffusion = assemblee.getFichierRARCSVDiffusion();
        if ( fichierRARCSVDiffusion == null ) {
            return null;
        }
        Long id = fichierRARCSVDiffusion.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierTrameRARDiffusionId(Assemblee assemblee) {
        if ( assemblee == null ) {
            return null;
        }
        FichierTrameRARDiffusion fichierTrameRARDiffusion = assemblee.getFichierTrameRARDiffusion();
        if ( fichierTrameRARDiffusion == null ) {
            return null;
        }
        Long id = fichierTrameRARDiffusion.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierTableExterneConvocationId(Assemblee assemblee) {
        if ( assemblee == null ) {
            return null;
        }
        Fichier fichierTableExterneConvocation = assemblee.getFichierTableExterneConvocation();
        if ( fichierTableExterneConvocation == null ) {
            return null;
        }
        Long id = fichierTableExterneConvocation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierTableExterneDiffusionId(Assemblee assemblee) {
        if ( assemblee == null ) {
            return null;
        }
        Fichier fichierTableExterneDiffusion = assemblee.getFichierTableExterneDiffusion();
        if ( fichierTableExterneDiffusion == null ) {
            return null;
        }
        Long id = fichierTableExterneDiffusion.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierFicheTravauxId(Assemblee assemblee) {
        if ( assemblee == null ) {
            return null;
        }
        Fichier fichierFicheTravaux = assemblee.getFichierFicheTravaux();
        if ( fichierFicheTravaux == null ) {
            return null;
        }
        Long id = fichierFicheTravaux.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
