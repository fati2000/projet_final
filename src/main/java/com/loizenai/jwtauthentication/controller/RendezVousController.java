package com.loizenai.jwtauthentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loizenai.jwtauthentication.model.RendezVous;
import com.loizenai.jwtauthentication.repository.RendezVousRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/auth")
public class RendezVousController {

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
	@DeleteMapping("/delete/{id}")
	public String deleteRendezVous(@PathVariable Long id) {
		rendezvousRepository.deleteById(id);
		return "Rendez Vous deleted with id : "+id;
	}
}
