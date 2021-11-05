package com.demo.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springrest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentController {
	private List<Student> students;

	@PostConstruct
	public void loadData() {
		students = new ArrayList<Student>();
		Student s1 = new Student("Akashdeep", "Bhattacharya");
		Student s2 = new Student("Paromita", "Saha");
		students.add(s1);
		students.add(s2);
	}

	@GetMapping("/students")
	public List<Student> getStudents() {

		return students;

	}

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		return students.get(studentId);

	}

}
