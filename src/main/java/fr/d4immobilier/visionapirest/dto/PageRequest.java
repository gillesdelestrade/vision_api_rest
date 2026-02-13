package fr.d4immobilier.visionapirest.dto;

public class PageRequest {
    
    private int page = 0;        // Numéro de page (commence à 0)
    private int size = 20;       // Nombre d'éléments par page
    private String sortBy;       // Champ de tri (ex: "nom")
    private String sortOrder = "ASC";  // ASC ou DESC
    
    public PageRequest() {
    }
    
    public PageRequest(int page, int size) {
        this.page = page;
        this.size = size;
    }
    
    public PageRequest(int page, int size, String sortBy, String sortOrder) {
        this.page = page;
        this.size = size;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    
    public int getPage() {
        return page;
    }
    
    public void setPage(int page) {
        this.page = Math.max(0, page);
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = Math.min(Math.max(1, size), 100); // Max 100 par page
    }
    
    public String getSortBy() {
        return sortBy;
    }
    
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }
    
    public String getSortOrder() {
        return sortOrder;
    }
    
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder != null && sortOrder.equalsIgnoreCase("DESC") ? "DESC" : "ASC";
    }
    
    public int getOffset() {
        return page * size;
    }
}