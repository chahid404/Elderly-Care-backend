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

import com.ult.elderlycare.dao.ActivityTypeRepository;
import com.ult.elderlycare.entities.ActivityType;



@CrossOrigin("*")

@RestController
public class ActivityTypeService {
	@Autowired
	private ActivityTypeRepository activityTypeRepository;
	
	
	@GetMapping(value = "/listActivityTypes")
	public List<ActivityType> listActivityType(){
		return activityTypeRepository.findAll();
	}
	
	
	@GetMapping(value = "/listActivityTypes/{id}")
	public ActivityType listActivityType(@PathVariable(name = "id") Long id){
		return activityTypeRepository.findById(id).get();
	}
	
	@PutMapping(value = "/listActivityTypes/{id}")
	public ActivityType updateActivityType(@PathVariable(name = "id") Long id,@RequestBody ActivityType p){
		p.setId(id);
		return activityTypeRepository.save(p);
	}
	
	
	@PostMapping(value = "/listActivityTypes")
	public ActivityType saveActivityType(@RequestBody ActivityType p){
		return activityTypeRepository.save(p);
	}
	
	@DeleteMapping(value = "/listActivityTypes/{id}")
	public void deleteActivityType(@PathVariable(name = "id") Long id){
		
		activityTypeRepository.deleteById(id);
	}
}
