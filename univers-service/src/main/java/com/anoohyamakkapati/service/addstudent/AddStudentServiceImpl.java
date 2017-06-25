package com.anoohyamakkapati.service.addstudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anoohyamaakapati.model.entity.Student;
import com.anoohyamakkapati.repository.addstudent.AddStudentRepository;

@Service
public class AddStudentServiceImpl implements AddStudentService {

	@Autowired
	private AddStudentRepository addStudentRepository;

	public void saveStudent(Student studentDAO) {
		
		Student student = new Student();
		student.setFirstName(studentDAO.getFirstName());
		student.setLastName(studentDAO.getLastName());
		student.setAge(studentDAO.getAge());
		student.setGender(studentDAO.getGender());
		student.setUniversity(studentDAO.getUniversity());
		
		addStudentRepository.save(student);
	}
}
