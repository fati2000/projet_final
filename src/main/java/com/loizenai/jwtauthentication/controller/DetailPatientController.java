package com.loizenai.jwtauthentication.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loizenai.jwtauthentication.model.PatientProfile;

import com.loizenai.jwtauthentication.repository.PatientProfileRepo;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/auth/")
public class DetailPatientController {
	
	@Autowired
	private PatientProfileRepo principal;
	@GetMapping("/detailsPatient/{cin}")
	
      public Optional<PatientProfile> getPatient(@ PathVariable String cin){
		return principal.findByCin(cin);
	}
}