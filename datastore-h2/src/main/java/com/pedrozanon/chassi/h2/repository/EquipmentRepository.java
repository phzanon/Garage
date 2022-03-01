package com.pedrozanon.chassi.h2.repository;

import com.pedrozanon.chassi.h2.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
