package com.kassim.StudentCRUDV1.service;

import com.kassim.StudentCRUDV1.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    //crud methods
    //CREATE OR ADD
    StudentEntity addStudent(StudentEntity student);
    //READ OR RETRIVE all Student
    List<StudentEntity> getAllStudent();
    //code for getting one student by id
    StudentEntity getStudentById(Long studentID);
    //code for updating
    StudentEntity updateStudent(StudentEntity student, Long id);
    //code for deleting
    void deleteStudent(Long id);
}
