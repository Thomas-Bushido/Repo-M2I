package org.example.tp_environnement.repository;

import org.example.tp_environnement.entity.Observation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObservationRepository extends JpaRepository<Observation, Long> {
}
