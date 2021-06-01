package com.loizenai.jwtauthentication.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loizenai.jwtauthentication.model.PatientProfile;

@Repository
public interface PatientProfileRepo extends JpaRepository<PatientProfile,Long> {
	Optional<PatientProfile> findByCin(String cin);

}
