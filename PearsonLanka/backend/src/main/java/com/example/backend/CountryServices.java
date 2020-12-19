package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServices {

	@Autowired
	private CountryRepository countryRepository;
	
	public CountryModel addCountry(CountryModel countryModel) {
		return countryRepository.save(countryModel);
	}

	public Iterable<CountryModel> findAll() {
		return countryRepository.findAll();
	}

	public CountryModel findById(Integer id) {
		return countryRepository.getById(id); 
	}

	public void delete(CountryModel cm) {
		countryRepository.delete(cm);
	}

	
}
