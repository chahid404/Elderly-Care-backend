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

import com.ult.elderlycare.dao.ActivityRepository;
import com.ult.elderlycare.entities.Activity;




@CrossOrigin("*")
@RestController
public class ActivityService {
	@Autowired
	private ActivityRepository activityRepository;
	
	@GetMapping(value = "/listActivitys")
	public List<Activity> listActivity(){
		return activityRepository.findAll();
	}
	
	
	@GetMapping(value = "/listActivitys/{id}")
	public Activity listActivity(@PathVariable(name = "id") Long id){
		return activityRepository.findById(id).get();
	}
	
	@PutMapping(value = "/listActivitys/{id}")
	public Activity updateActivity(@PathVariable(name = "id") Long id,@RequestBody Activity p){
		p.setId(id);
		return activityRepository.save(p);
	}
	
	
	@PostMapping(value = "/listActivitys")
	public Activity saveActivity(@RequestBody Activity p){
		return activityRepository.save(p);
	}
	
	@DeleteMapping(value = "/listActivitys/{id}")
	public void deleteActivity(@PathVariable(name = "id") Long id){
		
		activityRepository.deleteById(id);
	}
}
