package com.loizenai.jwtauthentication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loizenai.jwtauthentication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByCin(String cin);
    Boolean existsByCin(String Cin);
    Boolean existsByEmail(String email);
}