package com.loizenai.jwtauthentication.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loizenai.jwtauthentication.exception.ResourceNotFoundException;
import com.loizenai.jwtauthentication.model.Medecin;
import com.loizenai.jwtauthentication.repository.MedecinRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/auth/")
public class MedecinController {
	@Autowired
	private MedecinRepository repository;
	
	//get all medecins
	@GetMapping("/Medecins")
	public List<Medecin> getAllMedecins(){
		return repository.findAll();
	}
	
	@PostMapping("/Medecins")
	public Medecin saveMedecin(@RequestBody Medecin medecin) {
		return repository.save(medecin);
		
	}
	
	//get medecin by id
	@GetMapping("/Medecins/{id}")
	public ResponseEntity<Medecin> getMedecinById(@ PathVariable Long id) {
		
		Medecin medecin = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("medecin not exist with id :" + id));
		return ResponseEntity.ok(medecin);
		
	}
	
	//update medecin
	
	@PutMapping("/Medecins/{id}")
	public ResponseEntity<Medecin> updtaeMedecin(@PathVariable Long id, @RequestBody Medecin medecinDetails){
		Medecin medecin = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("medecin not exist with id :" + id));
		medecin.setNom(medecinDetails.getNom());
		medecin.setPrenom(medecinDetails.getPrenom());
		medecin.setCni(medecinDetails.getCni());
		medecin.setEmail(medecinDetails.getEmail());
		medecin.setPassword(medecinDetails.getPassword());
		medecin.setCentre_vaccination(medecinDetails.getCentre_vaccination());
		
		Medecin updatedMedecin = repository.save(medecin);
		return ResponseEntity.ok(updatedMedecin);
		
	}
	
	//delete medecin
	@DeleteMapping("Medecins/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteMedecin(@PathVariable Long id){
		Medecin medecin = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("medecin not exist with id :" + id));
		repository.delete(medecin);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	

}