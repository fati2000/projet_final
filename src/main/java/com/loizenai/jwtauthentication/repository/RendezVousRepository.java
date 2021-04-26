package com.loizenai.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loizenai.jwtauthentication.model.RendezVous;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous, Long>{

}

