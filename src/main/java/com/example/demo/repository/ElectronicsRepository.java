package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.electronics.Electronics;

public interface ElectronicsRepository extends CrudRepository<Electronics,Integer>{
	

}
