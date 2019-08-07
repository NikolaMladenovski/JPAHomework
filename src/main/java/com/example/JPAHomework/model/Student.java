package com.example.JPAHomework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student{
    @Id
    @GeneratedValue
    private Long StudentId;

    @Column(nullable = false,unique = true)
    private String index;

    private String studentName;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Professor> professors;

    public Student(String index, String studentName){
        this.index=index;
        this.studentName=studentName;
    }
}
