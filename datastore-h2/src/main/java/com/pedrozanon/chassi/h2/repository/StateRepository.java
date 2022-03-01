package com.pedrozanon.chassi.h2.repository;

import com.pedrozanon.chassi.h2.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
