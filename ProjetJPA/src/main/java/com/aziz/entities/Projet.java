package com.aziz.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projet implements Serializable {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
    private Long idProjet;
    private String nomProjet;
    private double cout;

    // Default constructor
    public Projet() {
        super();
    }

    // Constructor with parameters
    public Projet(String nomProjet, double cout) {
        super();
        this.nomProjet = nomProjet;
        this.cout = cout;
    }

    // Getter and setter methods
    public Long getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(Long idProjet) {
        this.idProjet = idProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public double getCout() {
        return cout;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }
}
