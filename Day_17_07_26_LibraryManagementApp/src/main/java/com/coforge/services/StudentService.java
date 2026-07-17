package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.entities.Student;
import com.coforge.repositories.StudentRepository;


@Service
public class StudentService {
	@Autowired
	StudentRepository repository;
	
	public Student addStudent(Student student) {
		return repository.save(student);
		
	}
	

	 public List<Student> getAllStudents() {
	        return repository.findAll();
	    }

	    public Student getStudentById(Integer id) {
	        return repository.findById(id).orElse(null);
	    }

	    public Student updateStudent(Integer id, Student student) {

	        Student existingStudent = repository.findById(id).orElse(null);

	        if(existingStudent != null) {

	            existingStudent.setSname(student.getSname());
	            existingStudent.setBranch(student.getBranch());
	            existingStudent.setAddress(student.getAddress());
	            existingStudent.setLibraryCard(student.getLibraryCard());
	            existingStudent.setSubjectList(student.getSubjectList());

	            return repository.save(existingStudent);
	        }

	        return null;
	    }

	    public String deleteStudent(Integer id) {

	        repository.deleteById(id);
	        return "Student Deleted Successfully";
	    }

	

}
