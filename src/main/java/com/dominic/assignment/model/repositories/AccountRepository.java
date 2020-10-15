package com.dominic.assignment.model.repositories;

import com.dominic.assignment.model.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    Optional<Account> findAllByAccountId(Integer id);

}
