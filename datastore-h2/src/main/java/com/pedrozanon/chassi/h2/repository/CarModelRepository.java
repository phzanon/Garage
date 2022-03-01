package com.pedrozanon.chassi.h2.repository;

import com.pedrozanon.chassi.h2.entity.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarModelRepository extends JpaRepository<CarModel, Long> {
}
