package com.anoohyamakkapati.service.showstudents;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anoohyamaakapati.model.entity.Student;
import com.anoohyamakkapati.repository.addstudent.ShowAllStudentsRepository;

@Service
public class ShowStudentsServiceImpl implements ShowStudentsService {

	@Autowired
	private ShowAllStudentsRepository showAllStudentsRepository;
	
	public List<Student> getAllStudents() {
		return showAllStudentsRepository.getAllStudents();
	}

}
