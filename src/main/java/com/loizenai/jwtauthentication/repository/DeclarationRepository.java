package com.loizenai.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loizenai.jwtauthentication.model.Declaration;

@Repository

public interface DeclarationRepository extends JpaRepository<Declaration, Long> {

}
