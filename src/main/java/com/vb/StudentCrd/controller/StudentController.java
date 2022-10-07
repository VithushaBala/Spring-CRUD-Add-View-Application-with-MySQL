package com.vb.StudentCrd.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vb.StudentCrd.service.StudentServiceImpl;
import com.vb.StudentCrd.student.Student1;

import ch.qos.logback.classic.Logger;

@RestController
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	
	private StudentServiceImpl studentServiceImpl;
	
	Logger logger=(Logger) LoggerFactory.getLogger(StudentController.class);
	
	@GetMapping("/hello")
	public String Hello() {
		
		logger.info("hello info level");
		return "hello";
	}
	
	//call saved students or to save new
	@RequestMapping(value = "saveStudent",  method = RequestMethod.POST)
	public Student1 saveStudent(@RequestBody Student1 student) {
		System.out.println("saved successfully");
		studentServiceImpl.saveStudent(student);
		return student;
	}
	
	//get
	@GetMapping(value = "findAllStudents")
	public List<Student1> findAllStudents(){
		return studentServiceImpl.findAllStudents();



	}}
