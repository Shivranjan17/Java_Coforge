package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Student;
import com.coforge.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}

	  @GetMapping("/students")
	    public List<Student> getAllStudents() {
	        return service.getAllStudents();
	    }

	    @GetMapping("/student/{id}")
	    public Student getStudentById(@PathVariable Integer id) {
	        return service.getStudentById(id);
	    }

	    @PutMapping("/student/{id}")
	    public Student updateStudent(@PathVariable Integer id,
	                                 @RequestBody Student student) {

	        return service.updateStudent(id, student);
	    }

	    @DeleteMapping("/student/{id}")
	    public String deleteStudent(@PathVariable Integer id) {

	        return service.deleteStudent(id);
	    }


}
