package com.example.JPAHomework;

import com.example.JPAHomework.model.*;
import com.example.JPAHomework.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@SpringBootApplication
public class JpaHomeworkApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private ProfessorRepository professorRepository;
    @Autowired
    private ExamRepository examRepository;
    @Autowired
    private SubjectDetailsRepository subjectDetailsRepository;


    public static void main(String[] args) {

        SpringApplication.run(JpaHomeworkApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Student nikola = new Student("211/2015", "Nikola");
        Student viktor = new Student("2", "Viktor");
        Student stefan = new Student("21", "Stefan");
        Student dimitar = new Student("211", "Dimitar");

        Professor daniel = new Professor("Daniel", 33);
        Professor hristijan = new Professor("Hristijan", 31);

        daniel.setStudents(Stream.of(nikola, viktor, stefan).collect(Collectors.toSet()));
        hristijan.setStudents(Stream.of(nikola, dimitar).collect(Collectors.toSet()));

        professorRepository.saveAll(Arrays.asList(daniel, hristijan));


        Subject pia = new Subject("PIA", 1);
        Subject nap = new Subject("NAP", 3);

        SubjectDetails piaDetails = new SubjectDetails("prog i algoritmi");
        pia.setSubjectDetails(piaDetails);

        SubjectDetails napDetails = new SubjectDetails("napredno prog");
        nap.setSubjectDetails(napDetails);

        Exam prvKolPia = new Exam("10.02");
        Exam vtorKolPia = new Exam("10.05");

        pia.setExams(Stream.of(prvKolPia, vtorKolPia).collect(Collectors.toSet()));

        Exam prvaNap = new Exam("01.01");
        Exam vtoraNap = new Exam("06.06");

        nap.setExams(Stream.of(prvaNap, vtoraNap).collect(Collectors.toSet()));

        subjectRepository.saveAll(Arrays.asList(pia, nap));

    }
}
