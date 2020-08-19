package com.example.demo.repository;

import com.example.demo.domain.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface IAdminRepos extends JpaRepository<CustomUser, Long> {

}
