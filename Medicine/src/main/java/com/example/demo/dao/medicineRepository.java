package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Medicine;


public interface medicineRepository extends CrudRepository<Medicine, Integer> {

}
