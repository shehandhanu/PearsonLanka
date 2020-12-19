package com.example.backend;

import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<CountryModel, Integer> {
	
	CountryModel getById(Integer id);

}
