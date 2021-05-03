package com.loizenai.jwtauthentication.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="patient_profiles")
public class Patient_Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="atcds")
	private String atcds;
	
	@Column(name="etatDeVaccination")
	private String etatDeVaccination;
	
	@Column(name="dateDePremereDose")
	private Date dateDePremereDose;
	
	@Column(name="dateDeuxiemeeDose")
	private Date dateDeuxiemeeDose;
	
	@Column(name="effetsInds")
	private String effetsInds;
	
	@Column(name="observations")
	private String observations;
	
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="patientprofile")
	private User user;
	
	public Patient_Profile() {
		
	}
	public Patient_Profile(long id, String atcds, String etatDeVaccination, Date dateDePremereDose,
			Date dateDeuxiemeeDose, String effetsInds, String observations) {
		super();
		this.id = id;
		this.atcds = atcds;
		this.etatDeVaccination = etatDeVaccination;
		this.dateDePremereDose = dateDePremereDose;
		this.dateDeuxiemeeDose = dateDeuxiemeeDose;
		this.effetsInds = effetsInds;
		this.observations = observations;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getAtcds() {
		return atcds;
	}


	public void setAtcds(String atcds) {
		this.atcds = atcds;
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


	public String getEffetsInds() {
		return effetsInds;
	}


	public void setEffetsInds(String effetsInds) {
		this.effetsInds = effetsInds;
	}


	public String getObservations() {
		return observations;
	}


	public void setObservations(String observations) {
		this.observations = observations;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user=user;
	}

}
