package com.dominic.assignment.model.repositories;

import com.dominic.assignment.model.entities.BankUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<BankUser, Integer> {

    Optional<BankUser> findByEmail(String email);

}
