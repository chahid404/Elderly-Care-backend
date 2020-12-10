package com.ult.elderlycare.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ult.elderlycare.entities.VideoPersonage;

@CrossOrigin("*")
@RepositoryRestResource
public interface VideoPersonageRepository extends JpaRepository<VideoPersonage, Long> {
	@RestResource(path = "/byVideoPersonageName")
	public List<VideoPersonage> findByNameContains(@Param("mc") String des);
	
	@RestResource(path = "/byVideoPersonageTitlePage")
	public Page<VideoPersonage> findByNameContains(@Param("mc") String des,Pageable pageable);
}
