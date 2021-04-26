package com.loizenai.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loizenai.jwtauthentication.model.CentreVaccination;

@Repository
public interface CentreVaccinationRepository extends JpaRepository<CentreVaccination, Long> {

}
