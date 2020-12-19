package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rest/api")
public class CountryControl {

	@Autowired
	private CountryServices countryServices;
	
	@PostMapping("/add")
	public CountryModel addupdateCountry(@RequestBody CountryModel countryModel) {
		return countryServices.addCountry(countryModel); 
	}
	
	@GetMapping("/findAll")
	public Iterable<CountryModel> findAllCountry() {
		return countryServices.findAll();
	}
	
	@GetMapping("/find/{id}")
	public CountryModel findById(@PathVariable Integer id) {
		return countryServices.findById(id);
	}

	@DeleteMapping("/deleteCountry/{id}")
	public void removeCountry(@PathVariable Integer id) {
		CountryModel cm = countryServices.findById(id);
		countryServices.delete(cm);	
	}
	
}
