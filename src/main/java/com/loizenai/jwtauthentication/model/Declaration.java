package com.loizenai.jwtauthentication.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "declarations", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "cin"
        })
})
public class Declaration {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=3, max = 50)
    private String nom;
    
    @NotBlank
    @Size(min=3, max = 50)
    private String prenom;

    @NotBlank
    @Size(min=3, max = 50)
    private String cin;
     private String effets;
     private String autres;
     
	public Declaration() {
	
		// TODO Auto-generated constructor stub
	}

	public Declaration(Long id,  String nom,
			String prenom,String cin,
			String effets, String autres) {
		
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.effets = effets;
		this.autres = autres;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getEffets() {
		return effets;
	}

	public void setEffets(String effets) {
		this.effets = effets;
	}

	public String getAutres() {
		return autres;
	}

	public void setAutres(String autres) {
		this.autres = autres;
	}
	
     
}
