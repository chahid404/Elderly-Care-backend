package com.ult.elderlycare;
import java.lang.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.ult.elderlycare.dao.ActivityRepository;
import com.ult.elderlycare.dao.ActivityTypeRepository;
import com.ult.elderlycare.entities.Activity;
import com.ult.elderlycare.entities.ActivityType;

@SpringBootApplication
public class MainElderlyCare implements CommandLineRunner{
	@Autowired
	private ActivityTypeRepository aaa;
	
	@Autowired 
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MainElderlyCare.class, args);
		// TODO Auto-generated method stub

	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		repositoryRestConfiguration.exposeIdsFor(Activity.class);
		
		aaa.save(new ActivityType(5,"test02"));
		//produitRepository.save(new Produit(null,"ordinateur 2",5700,4));
		//produitRepository.save(new Produit(null,"ordinateur 3",4700,5));
		
		aaa.findAll().forEach(p ->{
			System.out.println(p.toString());
		});
	}

}
