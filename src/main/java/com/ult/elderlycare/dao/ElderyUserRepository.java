package com.ult.elderlycare.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ult.elderlycare.entities.ElderyUser;
@CrossOrigin("*")
@RepositoryRestResource
public interface ElderyUserRepository extends JpaRepository<ElderyUser, Long> {
	/*@RestResource(path = "/byElderyUserName")
	public List<ElderyUser> findByFullnameContains(@Param("mc") String des);
	
	@RestResource(path = "/byElderyUserNamePage")
	public Page<ElderyUser> findByFullNameContains(@Param("mc") String des,Pageable pageable);*/

}
