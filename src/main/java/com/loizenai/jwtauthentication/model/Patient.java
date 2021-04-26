package com.loizenai.jwtauthentication.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Patients")

public class Patient {	
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private long id;
		
	public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
	@Column(name="cin")
		private String cin;
	
	@Column(name="nom")
		private String nom;
	
	@Column(name="prenom")
		private String prenom;
	
	@Column(name="age")
		private int age;
	
	@Column(name="sexe")
		private String sexe;
	
	@Column(name="adresse")
		private String adresse;
	
	@Column(name="email")
		private String email;
	
	@Column(name="tel")
		private String tel;
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
	
		
		public Patient() {
			
		}
		public Patient(Long id, String cin, String nom, String prenom, int age, String sexe,String adresse, String email, String tel,String atcds, String etatDeVaccination,Date dateDePremereDose,Date dateDeuxiemeeDose,
				String effetsInds, String observations) {
			this.id=id;
			this.cin = cin;
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
			this.sexe = sexe;
			this.adresse=adresse;
			this.email=email;
			this.tel=tel;
			this.atcds=atcds;
			this.etatDeVaccination = etatDeVaccination;
			this.dateDePremereDose= dateDePremereDose;
			this.dateDeuxiemeeDose= dateDeuxiemeeDose;
			this.effetsInds = effetsInds;
			this.observations= observations;
		}
		public String getCin() {
			return cin;
		}
		public void setCin(String cin) {
			this.cin = cin;
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSexe() {
			return sexe;
		}
		public void setSexe(String sexe) {
			this.sexe = sexe;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
	
		public String getatcds() {
			return atcds;
		}
		public void setatcds(String atcds) {
			atcds = atcds;
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
		public String getObservations() {
			return observations;
		}
		public void setObservations(String observations) {
			this.observations = observations;
		}
		public String getEffetsInds() {
			return effetsInds;
		}
		public void setEffetsInds(String effetsInds) {
			this.effetsInds = effetsInds;
		}
}