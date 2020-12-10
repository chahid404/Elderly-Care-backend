package com.ult.elderlycare.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ult.elderlycare.dao.PeluleRepository;
import com.ult.elderlycare.entities.Pelule;

@CrossOrigin("*")
@RestController
public class PeluleService {

	
	@Autowired
	private PeluleRepository peluleRepository;
	
	@GetMapping(value = "/listPelules")
	public List<Pelule> listPelule(){
		return peluleRepository.findAll();
	}
	
	
	@GetMapping(value = "/listPelules/{id}")
	public Pelule listPelule(@PathVariable(name = "id") Long id){
		return peluleRepository.findById(id).get();
	}
	
	@PutMapping(value = "/listPelules/{id}")
	public Pelule updatePelule(@PathVariable(name = "id") Long id,@RequestBody Pelule p){
		p.setId(id);
		return peluleRepository.save(p);
	}
	
	
	@PostMapping(value = "/listPelules")
	public Pelule savePelule(@RequestBody Pelule p){
		return peluleRepository.save(p);
	}
	
	@DeleteMapping(value = "/listPelules/{id}")
	public void deletePelule(@PathVariable(name = "id") Long id){
		
		peluleRepository.deleteById(id);
	}
	
	
}
