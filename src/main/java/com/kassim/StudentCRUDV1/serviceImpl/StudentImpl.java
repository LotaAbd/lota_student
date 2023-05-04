package com.kassim.StudentCRUDV1.serviceImpl;

import com.kassim.StudentCRUDV1.entity.StudentEntity;
import com.kassim.StudentCRUDV1.exception.StudentException;
import com.kassim.StudentCRUDV1.repository.StudentRepository;
import com.kassim.StudentCRUDV1.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentEntity addStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity getStudentById(Long studentID) {
        StudentEntity student = studentRepository.findById(studentID)
                .orElseThrow(()-> new StudentException("Student not found"));

        return student;
    }

    @Override
    public StudentEntity updateStudent(StudentEntity student, Long id) {
        StudentEntity student1 = studentRepository.findById(id)
                .orElseThrow(()->new StudentException("Student NOt found"));

        student1.setStudentID(student1.getStudentID());
        student1.setFirstName(student1.getFirstName());
        student1.setLastName(student1.getLastName());
        student1.setAge(student.getAge());

        studentRepository.save(student1);
        return student1;
    }

    @Override
    public void deleteStudent(Long id) {
        StudentEntity student = studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Student not found"));

        studentRepository.delete(student);
    }


}
