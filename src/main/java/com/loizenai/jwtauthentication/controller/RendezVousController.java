package com.loizenai.jwtauthentication.controller;

import java.util.List;

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
import com.loizenai.jwtauthentication.model.PatientProfile;
import com.loizenai.jwtauthentication.model.RendezVous;
import com.loizenai.jwtauthentication.repository.PatientProfileRepo;
import com.loizenai.jwtauthentication.repository.RendezVousRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/auth")
public class RendezVousController {
	
	@Autowired
	private PatientProfileRepo patientRepo;

	@Autowired
	private RendezVousRepository rendezvousRepository;
	
	//get all RendezVous
	@GetMapping("/AllRendezVous")
	public List<RendezVous> getAllRendezVous(){
		return rendezvousRepository.findAll();
	}
	@PostMapping("/addRDV")	
	public String saveRDV(@RequestBody RendezVous rdv) {
		rendezvousRepository.save(rdv);
		return "added Rendez Vous with name: "+rdv.getDate();
	}
	@PutMapping("/rendezvous/{cin}")
	public ResponseEntity<PatientProfile> ficheDepatient(@PathVariable String cin,@RequestBody PatientProfile patientDetails){
		PatientProfile patient = patientRepo.findByCin(cin)
				.orElseThrow(()-> new ResourceNotFoundException("Patient not exist with id:"+cin));
		patient.setDateDePremereDose(patientDetails.getDateDePremereDose());
		patient.setDateDeuxiemeeDose(patientDetails.getDateDeuxiemeeDose());
		patient.setCentre(patientDetails.getCentre());
		PatientProfile ficheDepatient =patientRepo.save(patient);
		return ResponseEntity.ok(ficheDepatient);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteRendezVous(@PathVariable Long id) {
		rendezvousRepository.deleteById(id);
		return "Rendez Vous deleted with id : "+id;
	}
}
