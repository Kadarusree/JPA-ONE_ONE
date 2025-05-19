package com.example.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "passport_details")
@Setter
@Getter
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String passportNumber;
	private LocalDateTime issueDate;
	private LocalDateTime expiryDate;
	
	@OneToOne
	@JoinColumn(name = "person_id")
	Person person;

}
