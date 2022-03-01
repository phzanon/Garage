package com.pedrozanon.chassi.h2.repository;

import com.pedrozanon.chassi.h2.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
