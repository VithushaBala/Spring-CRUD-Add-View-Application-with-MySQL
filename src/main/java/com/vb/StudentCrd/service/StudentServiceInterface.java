package com.vb.StudentCrd.service;

import com.vb.StudentCrd.student.Student1;

import java.util.List;

public interface StudentServiceInterface {
	
	//save new student
	public Student1 saveStudent(Student1 student);
		
	
//get all Students
public List<Student1> findAllStudents(); 

}
