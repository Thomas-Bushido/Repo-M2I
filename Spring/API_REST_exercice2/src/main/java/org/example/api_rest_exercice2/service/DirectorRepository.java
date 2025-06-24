package org.example.api_rest_exercice2.service;

import org.example.api_rest_exercice2.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.List;

@Repository
public interface DirectorRepository extends JpaRepository<Director,Long> {
}
