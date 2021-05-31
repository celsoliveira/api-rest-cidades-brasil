package com.github.celsoliveira.citiesapi.staties.repository;

import com.github.celsoliveira.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

