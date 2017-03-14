package tech.tarragona.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.tarragona.spring.model.Cars;
import tech.tarragona.spring.repository.CarsRepository;

@Service
public class CarsServise {
	@Autowired
	CarsRepository carsRepository;

	public List<Cars> getCars() {
		// TODO Auto-generated method stub
		return carsRepository.findAll();
	}
	
	@Transactional
	public Cars getCarsByMatricula(String matricula){
		return carsRepository.findByMatricula(matricula);
	}
	
	@Transactional
	public Cars saveCars(Cars cars) {
		return carsRepository.save(cars);
		
	}
	
	
	
}
