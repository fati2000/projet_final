package com.loizenai.jwtauthentication.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loizenai.jwtauthentication.exception.ResourceNotFoundException;
import com.loizenai.jwtauthentication.model.Patient;
import com.loizenai.jwtauthentication.repository.PatientRepository;
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RequestMapping("/api/auth")
@RestController
public class PatientController {
	@Autowired
	private PatientRepository patientRepository;
	
	@GetMapping("/findAllPatients")
	public List<Patient> getPatients(){
		return patientRepository.findAll();
	}
@PostMapping("/addPatient")
	
	public String savePatient(@RequestBody Patient patient) {
		
	patientRepository.save(patient);
		return "added patient with name: "+patient.getNom();
		
	}
	@GetMapping("/findAllPatients/{id}")
	public Optional<Patient> getPatient(@PathVariable long id){
		return patientRepository.findById(id);
	}
	@PutMapping("/patients/{id}")
	public ResponseEntity<Patient> ficheDepatient(@PathVariable Long id,@RequestBody Patient patientDetails){
		Patient patient = patientRepository.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Patient not exist with id:"+id));
		patient.setNom(patientDetails.getNom());
		patient.setPrenom(patientDetails.getPrenom());
		patient.setCin(patientDetails.getCin());
		patient.setAge(patientDetails.getAge());
		patient.setSexe(patientDetails.getSexe());
		patient.setAdresse(patientDetails.getAdresse());
		patient.setEmail(patientDetails.getEmail());
		patient.setTel(patientDetails.getTel());
		patient.setatcds(patientDetails.getatcds());
		patient.setEtatDeVaccination(patientDetails.getEtatDeVaccination());
		patient.setDateDePremereDose(patientDetails.getDateDePremereDose());
		patient.setDateDeuxiemeeDose(patientDetails.getDateDeuxiemeeDose());
		patient.setEffetsInds(patientDetails.getEffetsInds());
		patient.setObservations(patientDetails.getObservations());
		
		Patient ficheDepatient =patientRepository.save(patient);
		return ResponseEntity.ok(ficheDepatient);
	}
}