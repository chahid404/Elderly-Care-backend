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

import com.ult.elderlycare.dao.MedicamentRepository;
import com.ult.elderlycare.entities.Medicament;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class MedicamentService {

	@Autowired
	private MedicamentRepository medicamentRepository;

	@GetMapping(value = "/listMedicaments")
	public List<Medicament> listMedicament() {
		return medicamentRepository.findAll();
	}

	@GetMapping(value = "/listMedicaments/{id}")
	public Medicament listMedicament(@PathVariable(name = "id") Long id) {
		return medicamentRepository.findById(id).get();
	}

	@PutMapping(value = "/listMedicaments/{id}")
	public Medicament updateMedicament(@PathVariable(name = "id") Long id, @RequestBody Medicament p) {
		p.setId(id);
		return medicamentRepository.save(p);
	}

	@PostMapping(value = "/listMedicaments")
	public Medicament saveMedicament(@RequestBody Medicament p) {
		return medicamentRepository.save(p);
	}

	@DeleteMapping(value = "/listMedicaments/{id}")
	public void deleteMedicament(@PathVariable(name = "id") Long id) {
		medicamentRepository.deleteById(id);
	}

}
