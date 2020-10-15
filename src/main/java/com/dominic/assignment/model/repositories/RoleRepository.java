package com.dominic.assignment.model.repositories;

import com.dominic.assignment.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findRoleByRoleId(Integer id);
}
