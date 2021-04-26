package com.loizenai.jwtauthentication.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "RendezVous")

public class RendezVous {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(columnDefinition = "date")
	private Date date;
	
	@Column(name = "heure")
	private String heure;
	
	@Column(name = "id_patient")
	private String id_patient;
	
	@Column(name = "id_medecin")
	private String id_medecin;
	
	@Column(name = "id_centre")
	private String id_centre;
	
	@Column(name ="etat")
	private String etat;
	
	public RendezVous() {
		
	}
	
	public RendezVous(Date date, String heure, String id_patient, String id_medecin, String id_centre, String etat) {
		super();
		this.date = date;
		this.heure = heure;
		this.id_patient = id_patient;
		this.id_medecin = id_medecin;
		this.id_centre = id_centre;
		this.etat = etat;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	public String getId_patient() {
		return id_patient;
	}
	public void setId_patient(String id_patient) {
		this.id_patient = id_patient;
	}
	public String getId_medecin() {
		return id_medecin;
	}
	public void setId_medecin(String id_medecin) {
		this.id_medecin = id_medecin;
	}
	public String getId_centre() {
		return id_centre;
	}
	public void setId_centre(String id_centre) {
		this.id_centre = id_centre;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
}
