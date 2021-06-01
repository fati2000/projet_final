package com.loizenai.jwtauthentication.model;

import java.sql.Date;
import javax.persistence.Entity;
@Entity
public class PatientProfile extends User {
	private String atcds;
	private String effets_sec;
	private String observations;
	private String etatDeVaccination;
	private Date dateDePremereDose;
	private Date dateDeuxiemeeDose;
	
	
	public PatientProfile() {
		super();
	}
	public PatientProfile(String prenom, String nom, 
			String cin,String tel, String email, String password, int age,String ville,String adresse, String sexe, String atcds, String effets_sec, String observations, String etatDeVaccination,
			Date dateDePremereDose, Date dateDeuxiemeeDose) {
		super(prenom,nom,cin,tel,email,password,age,ville,adresse,sexe);
		this.atcds = atcds;
		this.effets_sec = effets_sec;
		this.observations = observations;
		this.etatDeVaccination = etatDeVaccination;
		this.dateDePremereDose = dateDePremereDose;
		this.dateDeuxiemeeDose = dateDeuxiemeeDose;
	}
	
	public PatientProfile(String atcds, String effets_sec, String observations, String etatDeVaccination,
			Date dateDePremereDose, Date dateDeuxiemeeDose) {
		super();
		this.atcds = atcds;
		this.effets_sec = effets_sec;
		this.observations = observations;
		this.etatDeVaccination = etatDeVaccination;
		this.dateDePremereDose = dateDePremereDose;
		this.dateDeuxiemeeDose = dateDeuxiemeeDose;
	}
	public String getAtcds() {
		return atcds;
	}
	public void setAtcds(String atcds) {
		this.atcds = atcds;
	}
	public String getEffets_sec() {
		return effets_sec;
	}
	public void setEffets_sec(String effets_sec) {
		this.effets_sec = effets_sec;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}
	public String getEtatDeVaccination() {
		return etatDeVaccination;
	}
	public void setEtatDeVaccination(String etatDeVaccination) {
		this.etatDeVaccination = etatDeVaccination;
	}
	public Date getDateDePremereDose() {
		return dateDePremereDose;
	}
	public void setDateDePremereDose(Date dateDePremereDose) {
		this.dateDePremereDose = dateDePremereDose;
	}
	public Date getDateDeuxiemeeDose() {
		return dateDeuxiemeeDose;
	}
	public void setDateDeuxiemeeDose(Date dateDeuxiemeeDose) {
		this.dateDeuxiemeeDose = dateDeuxiemeeDose;
	}
	
	

}
