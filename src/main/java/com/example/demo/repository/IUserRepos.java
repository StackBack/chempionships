package com.example.demo.repository;

import com.example.demo.domain.Championship;
import com.example.demo.domain.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface IUserRepos extends JpaRepository<CustomUser, Long> {
    boolean existsByEmail(@Param("email") String email);
    CustomUser findByFirstName(@Param("firstName") String firstName);
    CustomUser findByEmail(@Param("email") String email);
}
