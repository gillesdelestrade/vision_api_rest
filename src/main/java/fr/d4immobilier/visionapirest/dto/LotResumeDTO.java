package fr.d4immobilier.visionapirest.dto;

public class LotResumeDTO {
    
    private Long id;
    private String numero;
    private CoproprieteResumeDTO copropriete;
    
    public LotResumeDTO() {}
    
    // Getters et Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public CoproprieteResumeDTO getCopropriete() {
        return copropriete;
    }
    
    public void setCopropriete(CoproprieteResumeDTO copropriete) {
        this.copropriete = copropriete;
    }
}