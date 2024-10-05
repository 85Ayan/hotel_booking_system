package com.phegondev.phegon_hotel.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phegondev.phegon_hotel.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email); 

    


}
