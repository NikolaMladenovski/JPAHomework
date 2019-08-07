package com.example.JPAHomework.repository;

import com.example.JPAHomework.model.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,Long> {
}
