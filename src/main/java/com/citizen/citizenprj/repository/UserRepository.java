package com.citizen.citizenprj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citizen.citizenprj.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
