package com.vb.StudentCrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vb.StudentCrd.repository.StudentRepository;
import com.vb.StudentCrd.student.Student1;

@Service
public class StudentServiceImpl implements StudentServiceInterface {
	
	
@Autowired
private StudentRepository studentRepo;

	@Override
	public Student1 saveStudent(Student1 student) {
		return studentRepo.save(student);
	}
	
	@Override
	public List<Student1> findAllStudents(){
		return (List<Student1>) studentRepo.findAll();
	}

}
