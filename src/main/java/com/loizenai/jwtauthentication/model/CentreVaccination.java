package com.loizenai.jwtauthentication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CentreVaccination")

public class CentreVaccination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Nom")
	private String Nom;
	
	@Column(name ="Quartier")
	private String Quartier;
	
	@Column(name ="Ville")
	private String Ville;
	

	public CentreVaccination(String nom, String quartier,String ville) {
		super();
		this.Nom = nom;
		this.Quartier = quartier;
		this.Ville = ville;
	}

	public CentreVaccination() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getQuartier() {
		return Quartier;
	}
	public void setQuartier(String quartier) {
		Quartier = quartier;
	}
	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

}
