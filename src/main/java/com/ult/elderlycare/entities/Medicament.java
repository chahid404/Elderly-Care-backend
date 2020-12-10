package com.ult.elderlycare.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data // jpa
@NoArgsConstructor // Constructor sans parametre
@AllArgsConstructor // Constructor avec parametre
@ToString
public class Medicament implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	private String description;
	private float mesure;
	private Date time;
	private int repitation;
}
