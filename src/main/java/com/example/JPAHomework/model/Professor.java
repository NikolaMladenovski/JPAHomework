package com.example.JPAHomework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @GeneratedValue
    private Long professorId;

    private String professorName;
    private int years;


    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Student> students;

    public Professor(String professorName, int years) {
        this.professorName = professorName;
        this.years = years;
    }

}
