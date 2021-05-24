package com.loizenai.jwtauthentication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loizenai.jwtauthentication.model.Patient;

@Repository

public interface PatientRepository extends JpaRepository<Patient,Long> {
	Optional<Patient> findByCin(String cin);
	

}