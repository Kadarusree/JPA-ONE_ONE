package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Person;


@Repository
public interface PersonRepo extends  JpaRepository<Person, Integer>{

}
