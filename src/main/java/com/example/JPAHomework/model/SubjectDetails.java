package com.example.JPAHomework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="subjectDetails")
public class SubjectDetails {
    @Id
    @GeneratedValue
    private Long subjectDetailsID;

    private String subjectDescription;

    @OneToOne
    private Subject subject;

    public SubjectDetails(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }
}
