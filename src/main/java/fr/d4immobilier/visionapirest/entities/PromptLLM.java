/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.d4immobilier.visionapirest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author gillesdelestrade
 */
@Entity
public class PromptLLM implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer numeroVersion;
    private ContextePromptLLM contextePromptLLM;
    private LLMProvider lLMProvider;
    private LocalDate dateCreation;
    private String prompt;
    
    /**
     * @return the numeroVersion
     */
    public Integer getNumeroVersion() {
        return numeroVersion;
    }

    /**
     * @param numeroVersion the numeroVersion to set
     */
    public void setNumeroVersion(Integer numeroVersion) {
        this.numeroVersion = numeroVersion;
    }

    /**
     * @return the contextePromptLLM
     */
    public ContextePromptLLM getContextePromptLLM() {
        return contextePromptLLM;
    }

    /**
     * @param contextePromptLLM the contextePromptLLM to set
     */
    public void setContextePromptLLM(ContextePromptLLM contextePromptLLM) {
        this.contextePromptLLM = contextePromptLLM;
    }

    /**
     * @return the lLMProvider
     */
    public LLMProvider getlLMProvider() {
        return lLMProvider;
    }

    /**
     * @param lLMProvider the lLMProvider to set
     */
    public void setlLMProvider(LLMProvider lLMProvider) {
        this.lLMProvider = lLMProvider;
    }

    /**
     * @return the dateCreation
     */
    public LocalDate getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the prompt
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * @param prompt the prompt to set
     */
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PromptLLM)) {
            return false;
        }
        PromptLLM other = (PromptLLM) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.d4immobilier.visionapirest.entities.PromptLLM[ id=" + id + " ]";
    }
    
}
