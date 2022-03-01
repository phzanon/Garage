package com.pedrozanon.chassi.h2.repository;

import com.pedrozanon.chassi.h2.entity.VehicleName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleNameRepository extends JpaRepository<VehicleName, Long> {
}
