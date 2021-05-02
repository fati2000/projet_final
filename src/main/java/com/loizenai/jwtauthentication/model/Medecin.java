package com.loizenai.jwtauthentication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Medecin")
public class Medecin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "cni")
	private String cni;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "centre_vaccination")
	private String centre_vaccination;
	
	public Medecin(){
		
	}
	
	
	public Medecin(String nom, String prenom, String email, String cni, String password, String centre_vaccination) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.cni = cni;
		this.password = password;
		this.centre_vaccination = centre_vaccination;
	}
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCni() {
		return cni;
	}
	public void setCni(String cni) {
		this.cni = cni;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCentre_vaccination() {
		return centre_vaccination;
	}
	public void setCentre_vaccination(String centre_vaccination) {
		this.centre_vaccination = centre_vaccination;
	}
	

}