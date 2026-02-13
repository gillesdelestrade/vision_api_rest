package fr.d4immobilier.visionapirest.mappers;

import java.util.List;

public interface GenericMapper<E, D> {
    D toDTO(E entity);
    E toEntity(D dto);
    List<D> toDTOList(List<E> entities);
}