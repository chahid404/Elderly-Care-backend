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

import com.ult.elderlycare.dao.RappelEvenementRepository;
import com.ult.elderlycare.entities.RappelEvenement;


@CrossOrigin("*")
@RestController
public class RappelEvenementService {

	
	@Autowired
	private RappelEvenementRepository	rappelEvenementRepository;
	
	@GetMapping(value = "/listRappelEvenements")
	public List<RappelEvenement> listRappelEvenement(){
		return rappelEvenementRepository.findAll();
	}
	
	
	@GetMapping(value = "/listRappelEvenements/{id}")
	public RappelEvenement listRappelEvenement(@PathVariable(name = "id") Long id){
		return rappelEvenementRepository.findById(id).get();
	}
	
	@PutMapping(value = "/listRappelEvenements/{id}")
	public RappelEvenement updateRappelEvenement(@PathVariable(name = "id") Long id,@RequestBody RappelEvenement p){
		p.setId(id);
		return rappelEvenementRepository.save(p);
	}
	
	
	@PostMapping(value = "/listRappelEvenements")
	public RappelEvenement saveRappelEvenement(@RequestBody RappelEvenement p){
		return rappelEvenementRepository.save(p);
	}
	
	@DeleteMapping(value = "/listRappelEvenements/{id}")
	public void deleteRappelEvenement(@PathVariable(name = "id") Long id){
		
		rappelEvenementRepository.deleteById(id);
	}
	
	
}
