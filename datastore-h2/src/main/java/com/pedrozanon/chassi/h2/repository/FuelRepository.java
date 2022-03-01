package com.pedrozanon.chassi.h2.repository;

import com.pedrozanon.chassi.h2.entity.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelRepository extends JpaRepository<Fuel, Long> {
}
