package com.pedrozanon.chassi.h2.repository;

import com.pedrozanon.chassi.h2.entity.Vehicle;
import com.pedrozanon.chassi.h2.entity.VehiclePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, VehiclePK> {
}
