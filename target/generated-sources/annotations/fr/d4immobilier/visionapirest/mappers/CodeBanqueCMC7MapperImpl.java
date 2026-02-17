package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CodeBanqueCMC7DTO;
import fr.d4immobilier.visionapirest.entities.CodeBanqueCMC7;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class CodeBanqueCMC7MapperImpl implements CodeBanqueCMC7Mapper {

    @Override
    public List<CodeBanqueCMC7DTO> toDTOList(List<CodeBanqueCMC7> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CodeBanqueCMC7DTO> list = new ArrayList<CodeBanqueCMC7DTO>( entities.size() );
        for ( CodeBanqueCMC7 codeBanqueCMC7 : entities ) {
            list.add( toDTO( codeBanqueCMC7 ) );
        }

        return list;
    }

    @Override
    public CodeBanqueCMC7DTO toDTO(CodeBanqueCMC7 entity) {
        if ( entity == null ) {
            return null;
        }

        CodeBanqueCMC7DTO codeBanqueCMC7DTO = new CodeBanqueCMC7DTO();

        codeBanqueCMC7DTO.setId( entity.getId() );
        codeBanqueCMC7DTO.setCode( entity.getCode() );

        return codeBanqueCMC7DTO;
    }

    @Override
    public CodeBanqueCMC7 toEntity(CodeBanqueCMC7DTO dto) {
        if ( dto == null ) {
            return null;
        }

        CodeBanqueCMC7 codeBanqueCMC7 = new CodeBanqueCMC7();

        codeBanqueCMC7.setId( dto.getId() );
        codeBanqueCMC7.setCode( dto.getCode() );

        return codeBanqueCMC7;
    }
}
