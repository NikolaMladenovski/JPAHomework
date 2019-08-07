package com.example.JPAHomework.repository;

import com.example.JPAHomework.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
