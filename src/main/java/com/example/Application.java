package com.example;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entities.Person;
import com.example.service.PersonPassportService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext mContext =	SpringApplication.run(Application.class, args);
	
	  PersonPassportService mService =  mContext.getBean(PersonPassportService.class);
	  
     mService.savePersonAndPassport(); 
	 Person mPerson = mService.getPersonById(1);
	 System.out.println(mPerson);
	 
	 
	}

}
