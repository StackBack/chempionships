package com.example.demo.repository;

import com.example.demo.domain.Championship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface IChampionshipsRepos extends JpaRepository<Championship, Long> {
    boolean existsByName(@Param("name") String name);
    Championship findByName(@Param("name") String name);
}
