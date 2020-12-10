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

import com.ult.elderlycare.dao.VideoPersonageRepository;
import com.ult.elderlycare.entities.VideoPersonage;

@CrossOrigin("*")
@RestController
public class VideoPersonageService {

	
	@Autowired
	private VideoPersonageRepository personageRepository ;
	
	@GetMapping(value = "/listVideoPersonages")
	public List<VideoPersonage> listVideoPersonage(){
		return personageRepository.findAll();
	}
	
	
	@GetMapping(value = "/listVideoPersonages/{id}")
	public VideoPersonage listVideoPersonage(@PathVariable(name = "id") Long id){
		return personageRepository.findById(id).get();
	}
	
	@PutMapping(value = "/listVideoPersonages/{id}")
	public VideoPersonage updateVideoPersonage(@PathVariable(name = "id") Long id,@RequestBody VideoPersonage p){
		p.setId(id);
		return personageRepository.save(p);
	}
	
	
	@PostMapping(value = "/listVideoPersonages")
	public VideoPersonage saveVideoPersonage(@RequestBody VideoPersonage p){
		return personageRepository.save(p);
	}
	
	@DeleteMapping(value = "/listVideoPersonages/{id}")
	public void deleteVideoPersonage(@PathVariable(name = "id") Long id){
		
		personageRepository.deleteById(id);
	}
	
	
}
