package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.dto.PageRequest;
import fr.d4immobilier.visionapirest.dto.PageResponse;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Order;
import jakarta.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

public abstract class GenericRepository<T, ID> {
    
    @PersistenceContext
    protected EntityManager em;
    
    protected abstract Class<T> getEntityClass();
    
    public List<T> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(getEntityClass());
        Root<T> root = cq.from(getEntityClass());
        cq.select(root);
        return em.createQuery(cq).getResultList();
    }
    
    public PageResponse<T> findAll(PageRequest pageRequest) {
        // Utiliser la version personnalisable si elle est surchargée
        return findAllWithCustomQuery(pageRequest);
    }
    
    // Méthode que les repositories peuvent surcharger pour personnaliser le chargement
    protected PageResponse<T> findAllWithCustomQuery(PageRequest pageRequest) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        
        // Requête pour les données
        CriteriaQuery<T> cq = cb.createQuery(getEntityClass());
        Root<T> root = cq.from(getEntityClass());
        cq.select(root);
        
        // Tri
        if (pageRequest.getSortBy() != null && !pageRequest.getSortBy().isEmpty()) {
            try {
                Order order = pageRequest.getSortOrder().equalsIgnoreCase("DESC")
                    ? cb.desc(root.get(pageRequest.getSortBy()))
                    : cb.asc(root.get(pageRequest.getSortBy()));
                cq.orderBy(order);
            } catch (IllegalArgumentException e) {
                // Champ de tri invalide, on ignore
            }
        }
        
        TypedQuery<T> query = em.createQuery(cq);
        query.setFirstResult(pageRequest.getOffset());
        query.setMaxResults(pageRequest.getSize());
        
        List<T> content = query.getResultList();
        
        // Requête pour le total
        long totalElements = count();
        
        return new PageResponse<>(content, pageRequest.getPage(), pageRequest.getSize(), totalElements);
    }
    
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(em.find(getEntityClass(), id));
    }
    
    public T save(T entity) {
        if (em.contains(entity)) {
            return em.merge(entity);
        } else {
            em.persist(entity);
            return entity;
        }
    }
    
    public void delete(ID id) {
        findById(id).ifPresent(entity -> em.remove(entity));
    }
    
    public long count() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<T> root = cq.from(getEntityClass());
        cq.select(cb.count(root));
        return em.createQuery(cq).getSingleResult();
    }
}