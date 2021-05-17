package com.github.celsoliveira.citiesapi.repository;

import com.github.celsoliveira.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
