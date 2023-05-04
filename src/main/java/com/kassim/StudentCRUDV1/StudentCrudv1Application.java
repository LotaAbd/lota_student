package com.kassim.StudentCRUDV1;

import com.kassim.StudentCRUDV1.entity.StudentEntity;
import com.kassim.StudentCRUDV1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentCrudv1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentCrudv1Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		StudentEntity student = new StudentEntity();
		student.setStudentID(123);
		student.setFirstName("Sevota");
		student.setLastName("Enock");
		student.setAge(26);
		studentRepository.save(student);

	}
}
