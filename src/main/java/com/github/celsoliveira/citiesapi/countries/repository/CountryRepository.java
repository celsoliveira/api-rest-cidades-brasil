package com.github.celsoliveira.citiesapi.countries.repository;

import com.github.celsoliveira.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
