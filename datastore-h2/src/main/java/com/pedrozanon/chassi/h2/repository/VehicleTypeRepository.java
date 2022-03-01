package com.pedrozanon.chassi.h2.repository;

import com.pedrozanon.chassi.h2.entity.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Long> {
}
