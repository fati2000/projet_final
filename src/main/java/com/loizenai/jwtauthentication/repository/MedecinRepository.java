package com.loizenai.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loizenai.jwtauthentication.model.Medecin;
@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {

}