package org.example.tp_environnement.repository;

import org.example.tp_environnement.entity.Travellog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravellogRepository extends JpaRepository<Travellog, Long> {
}
