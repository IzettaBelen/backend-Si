package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Farmacia;
import com.example.demo.repositories.FarmaciaRepository;

@Service
public class FarmaciaService {
	@Autowired
	FarmaciaRepository farmaciaRepository;
	
	
	public ArrayList<Farmacia> obtenerFarmacias(){
		return (ArrayList<Farmacia>) farmaciaRepository.findAll();
	}
	
	public Farmacia guardarFarmacia(Farmacia farmacia) {
		return farmaciaRepository.save(farmacia);
	}

}
