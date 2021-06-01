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
import com.loizenai.jwtauthentication.model.PatientProfile;
import com.loizenai.jwtauthentication.repository.PatientProfileRepo;
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RequestMapping("/api/auth")
@RestController
public class PatientController {

	
	@Autowired
	private PatientProfileRepo patientRepo;
	
	@GetMapping("/findAllPatients")
	public List<PatientProfile> getPatients(){
		return patientRepo.findAll();
	}
@PostMapping("/addPatient")
	
	public String savePatient(@RequestBody PatientProfile patient) {
		
	patientRepo.save(patient);
		return "added patient with name: "+patient.getNom();
		
	}
	@GetMapping("/findAllPatients/{id}")
	public Optional<PatientProfile> getPatient(@PathVariable long id){
		return patientRepo.findById(id);
	}
	@PutMapping("/patients/{id}")
	public ResponseEntity<PatientProfile> ficheDepatient(@PathVariable Long id,@RequestBody PatientProfile patientDetails){
		PatientProfile patient = patientRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Patient not exist with id:"+id));
		patient.setNom(patientDetails.getNom());
		patient.setPrenom(patientDetails.getPrenom());
		patient.setCin(patientDetails.getCin());
		patient.setAge(patientDetails.getAge());
		patient.setSexe(patientDetails.getSexe());
		patient.setAdresse(patientDetails.getAdresse());
		patient.setEmail(patientDetails.getEmail());	
		patient.setTel(patientDetails.getTel());	
		patient.setAtcds(patientDetails.getAtcds());
		patient.setEtatDeVaccination(patientDetails.getEtatDeVaccination());
		patient.setDateDePremereDose(patientDetails.getDateDePremereDose());
		patient.setDateDeuxiemeeDose(patientDetails.getDateDeuxiemeeDose());
		patient.setEffets_sec(patientDetails.getEffets_sec());
		patient.setObservations(patientDetails.getObservations());
		
		PatientProfile ficheDepatient =patientRepo.save(patient);
		return ResponseEntity.ok(ficheDepatient);
	}
}