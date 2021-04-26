package com.loizenai.jwtauthentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loizenai.jwtauthentication.model.CentreVaccination;
import com.loizenai.jwtauthentication.repository.CentreVaccinationRepository;

@RestController
@RequestMapping("/api/auth")
public class CentreVaccinationController {
	
	@Autowired
	private CentreVaccinationRepository centreRepository;
	
	//get all CentreVaccination
	@GetMapping("/AllCentres")
	public List<CentreVaccination> getAllCentreVaccination(){
		return centreRepository.findAll();
	}
}
