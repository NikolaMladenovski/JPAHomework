package com.example.JPAHomework;

import com.example.JPAHomework.model.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaHomeworkApplicationTests {


	@Before
	public void setUp(){
		Student student = new Student("211/2015","Nikola");
	}

	@Test
	public void contextLoads() {

	}

}
