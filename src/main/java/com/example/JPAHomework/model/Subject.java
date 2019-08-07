package com.example.JPAHomework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue
    private Long subjectId;

    private String subjectName;

    private int semester;

    @OneToOne(mappedBy = "subject",cascade = CascadeType.PERSIST)
    private SubjectDetails subjectDetails;

    @OneToMany(mappedBy = "subjectInExam",cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    Set<Exam> exams;


    public Subject(String subjectName,int semester){
        this.subjectName = subjectName;
        this.semester = semester;
    }


}
