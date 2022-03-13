package com.km.bank.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compte {

    private Integer compteId;
    private String numeroCompte;
    private Date dateCreation;
    private double solde;
    private Personne personne;
    private List<Operation> operations = new ArrayList<>();

    public Compte(Integer compteId, String numeroCompte, double solde, Personne personne) {
        this.compteId = compteId;
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.personne = personne;
    }

    public Integer getCompteId() {
        return compteId;
    }

    public void setCompteId(Integer compteId) {
        this.compteId = compteId;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
}
