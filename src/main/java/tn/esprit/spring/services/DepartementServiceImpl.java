package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.repository.DepartementRepository;

@Service
public class DepartementServiceImpl implements IDepartementService {

	@Autowired
	DepartementRepository deptRepository2;

	public List<Departement> getAllDepartements() {
		return (List<Departement>) deptRepository2.findAll();
	}

	@Override
	public Departement addOrUpdateDep(Departement d) {
		Departement dept = deptRepository2.save(d);
		return dept;
	}
	
	

}
