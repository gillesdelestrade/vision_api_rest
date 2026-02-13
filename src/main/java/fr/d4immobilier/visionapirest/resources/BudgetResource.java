package fr.d4immobilier.visionapirest.resources;

import fr.d4immobilier.visionapirest.dto.BudgetDTO;
import fr.d4immobilier.visionapirest.entities.Budget;
import fr.d4immobilier.visionapirest.mappers.BudgetMapper;
import fr.d4immobilier.visionapirest.mappers.GenericMapper;
import fr.d4immobilier.visionapirest.repositories.BudgetRepository;
import fr.d4immobilier.visionapirest.repositories.GenericRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/budgets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BudgetResource extends GenericResource<Budget, BudgetDTO, Long> {
    
    @Inject
    private BudgetRepository repository;
    
    @Inject
    private BudgetMapper mapper;
    
    @Override
    protected GenericRepository<Budget, Long> getRepository() {
        return repository;
    }
    
    @Override
    protected GenericMapper<Budget, BudgetDTO> getMapper() {
        return mapper;
    }
    
    // Ajoutez ici des endpoints spécifiques si nécessaire
}
