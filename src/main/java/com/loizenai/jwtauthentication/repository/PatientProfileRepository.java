package com.loizenai.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loizenai.jwtauthentication.model.Patient_Profile;

@Repository
public interface PatientProfileRepository extends JpaRepository<Patient_Profile, Long> {

}
