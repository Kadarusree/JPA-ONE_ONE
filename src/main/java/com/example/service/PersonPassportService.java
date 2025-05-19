package com.example.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Passport;
import com.example.entities.Person;
import com.example.repo.PersonRepo;

@Service
public class PersonPassportService {
	
	
	@Autowired
	private PersonRepo personRepo;
	
	public void savePersonAndPassport() {
		
		Person person = new Person();
		person.setName("John Doe");
		
		
		Passport passport = new Passport();
		passport.setPassportNumber("A12345678");
		passport.setIssueDate(LocalDateTime.now());
		passport.setExpiryDate(LocalDateTime.now().plusYears(10));
		
		
		passport.setPerson(person);
		person.setPassport(passport);
		
		
		personRepo.save(person);
		
		
	}
	
	
	public Person getPersonById(Integer id) {
		return personRepo.findById(id).orElse(null);
	}

}
