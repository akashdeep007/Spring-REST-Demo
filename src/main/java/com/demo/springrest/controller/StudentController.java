package com.demo.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springrest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList<Student>();
		Student s1 = new Student("Akashdeep", "Bhattacharya");
		Student s2 = new Student("Paromita", "Saha");
		students.add(s1);
		students.add(s2);
		return students;
		
	}

}
