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

import com.ult.elderlycare.dao.ElderyUserRepository;
import com.ult.elderlycare.entities.ElderyUser;



@CrossOrigin("*")
@RestController
public class ElderyUserService {
	
	@Autowired
	private ElderyUserRepository elderyUserRepository;
	
	@GetMapping(value = "/listElderyUsers")
	public List<ElderyUser> listElderyUser(){
		return elderyUserRepository.findAll();
	}
	
	
	@GetMapping(value = "/listElderyUsers/{id}")
	public ElderyUser listElderyUser(@PathVariable(name = "id") Long id){
		return elderyUserRepository.findById(id).get();
	}
	
	@PutMapping(value = "/listElderyUsers/{id}")
	public ElderyUser updateElderyUser(@PathVariable(name = "id") Long id,@RequestBody ElderyUser p){
		p.setId(id);
		return elderyUserRepository.save(p);
	}
	
	
	@PostMapping(value = "/listElderyUsers")
	public ElderyUser saveElderyUser(@RequestBody ElderyUser p){
		return elderyUserRepository.save(p);
	}
	
	@DeleteMapping(value = "/listElderyUsers/{id}")
	public void deleteElderyUser(@PathVariable(name = "id") Long id){
		
		elderyUserRepository.deleteById(id);
	}

}
