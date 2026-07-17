
package com.coforge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
