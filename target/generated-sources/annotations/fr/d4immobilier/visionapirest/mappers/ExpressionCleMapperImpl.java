package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ExpressionCleDTO;
import fr.d4immobilier.visionapirest.entities.ExpressionCle;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class ExpressionCleMapperImpl implements ExpressionCleMapper {

    @Override
    public List<ExpressionCleDTO> toDTOList(List<ExpressionCle> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ExpressionCleDTO> list = new ArrayList<ExpressionCleDTO>( entities.size() );
        for ( ExpressionCle expressionCle : entities ) {
            list.add( toDTO( expressionCle ) );
        }

        return list;
    }

    @Override
    public ExpressionCleDTO toDTO(ExpressionCle entity) {
        if ( entity == null ) {
            return null;
        }

        ExpressionCleDTO expressionCleDTO = new ExpressionCleDTO();

        expressionCleDTO.setId( entity.getId() );
        expressionCleDTO.setExpression( entity.getExpression() );

        return expressionCleDTO;
    }

    @Override
    public ExpressionCle toEntity(ExpressionCleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ExpressionCle expressionCle = new ExpressionCle();

        expressionCle.setId( dto.getId() );
        expressionCle.setExpression( dto.getExpression() );

        return expressionCle;
    }
}
