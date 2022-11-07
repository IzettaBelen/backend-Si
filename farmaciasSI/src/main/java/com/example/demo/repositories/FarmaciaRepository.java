package com.example.demo.repositories;

import com.example.demo.models.Farmacia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface FarmaciaRepository extends CrudRepository<Farmacia, Integer>{

}
