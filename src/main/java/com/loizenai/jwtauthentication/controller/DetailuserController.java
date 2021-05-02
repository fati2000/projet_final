package com.loizenai.jwtauthentication.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	
}