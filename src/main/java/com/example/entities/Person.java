package com.example.entities;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "person_details")
@Data
public class Person {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personID;
	
	
	private String name;
	
	//Comment
	
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Passport passport;
	
	
	
	

}
