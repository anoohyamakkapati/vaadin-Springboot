package com.anoohyamakkapati.service.showuniversities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anoohyamaakapati.model.entity.University;
import com.anoohyamakkapati.repository.university.ShowAllUniversitiesRepository;

@Service
public class ShowAllUniversitiesServiceImpl implements ShowAllUniversitiesService {

	@Autowired
	private ShowAllUniversitiesRepository showAllUniversitiesRepository;
	
	public List<University> getAllUniversities() {
		return showAllUniversitiesRepository.getAllUniversities();
	}
}
