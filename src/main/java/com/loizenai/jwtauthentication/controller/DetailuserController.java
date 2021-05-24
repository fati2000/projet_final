package com.loizenai.jwtauthentication.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loizenai.jwtauthentication.exception.ResourceNotFoundException;
import com.loizenai.jwtauthentication.model.User;
import com.loizenai.jwtauthentication.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/auth/")
public class DetailuserController {
	
	@Autowired
	private UserRepository principal;
	@GetMapping("/details/{cin}")
    
	
	
      public Optional<User> getuser(@ PathVariable String cin){
		return principal.findByCin(cin);
	}
	
	@PutMapping("/User/{cin}")
	public ResponseEntity<User> updateUser(@PathVariable String cin, @RequestBody User userDetails){
		User users = principal.findByCin(cin)
				.orElseThrow(() -> new ResourceNotFoundException("medecin not exist with id :" + cin));
		users.setNom(userDetails.getNom());
		users.setPrenom(userDetails.getPrenom());
		users.setEmail(userDetails.getEmail());
		
		users.setAdresse(userDetails.getAdresse());
		users.setVille(userDetails.getVille());
		
		
		User updatedUser = principal.save(users);
		return ResponseEntity.ok(updatedUser);
		
	}
	
}