package com.example.JPAHomework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "exam")
public class Exam {
    @Id
    @GeneratedValue
    private Long examID;

    private String examDate;

    @ManyToOne
    private Subject subjectInExam;

    public Exam(String date) {
        this.examDate = date;
    }

}
