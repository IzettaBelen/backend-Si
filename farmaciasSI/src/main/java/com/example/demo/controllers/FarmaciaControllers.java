package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Farmacia;
import com.example.demo.services.FarmaciaService;

@RestController
@RequestMapping("/farmacia")
public class FarmaciaControllers {
	
	@Autowired
	FarmaciaService farmaciaService;
	
	@GetMapping()
	public ArrayList<Farmacia> obtenerFarmacias(){
		return farmaciaService.obtenerFarmacias();
	}
	
	@PostMapping()
	public Farmacia guardarFarmacia(@RequestBody Farmacia farmacia) {
		return this.farmaciaService.guardarFarmacia(farmacia);
	}

}
