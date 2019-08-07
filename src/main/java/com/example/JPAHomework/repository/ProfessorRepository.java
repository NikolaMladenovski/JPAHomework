package com.example.JPAHomework.repository;

import com.example.JPAHomework.model.Professor;
import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepository extends CrudRepository<Professor,Long> {
}
