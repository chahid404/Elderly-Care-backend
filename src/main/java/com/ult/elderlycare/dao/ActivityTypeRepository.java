package com.ult.elderlycare.dao;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ult.elderlycare.entities.ActivityType;


@CrossOrigin("*")
@RepositoryRestResource
public interface ActivityTypeRepository extends JpaRepository<ActivityType, Long> {
	@RestResource(path = "/byActivityTypeTitle")
	public List<ActivityType> findByTitleContains(@Param("mc") String des);
	
	@RestResource(path = "/byActivityTypeTitlePage")
	public Page<ActivityType> findByTitleContains(@Param("mc") String des,Pageable pageable);
}
