package com.km.bank.model;

import java.util.Date;
import java.util.List;

public class Personne {

    private Integer personneId;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Adresse adresse;
    private List<Compte> comptes;

    public Personne(Integer personneId, String nom, String prenom) {
        this.personneId = personneId;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Integer getPersonneId() {
        return personneId;
    }

    public void setPersonneId(Integer personneId) {
        this.personneId = personneId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
