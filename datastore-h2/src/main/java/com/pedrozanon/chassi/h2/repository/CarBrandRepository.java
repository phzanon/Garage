package com.pedrozanon.chassi.h2.repository;

import com.pedrozanon.chassi.h2.entity.CarBrand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarBrandRepository extends JpaRepository<CarBrand, Long> {
}
