package com.kassim.StudentCRUDV1.controller;

import com.kassim.StudentCRUDV1.entity.StudentEntity;
import com.kassim.StudentCRUDV1.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sevota/student_infos")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Add student
    @PostMapping
    public ResponseEntity<StudentEntity> addStudent(@RequestBody StudentEntity student){
        return new ResponseEntity<StudentEntity>(studentService.addStudent(student), HttpStatus.CREATED);
    }

    //Code for getting all Students
    @GetMapping
    public List<StudentEntity> getAllStudents(){
        return studentService.getAllStudent();
    }

    //code for getting student by id
    @GetMapping("{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable Long id){
        return new ResponseEntity<StudentEntity>(studentService.getStudentById(id), HttpStatus.OK);
    }

    //code for updating
    @PutMapping("{id}")
    public ResponseEntity<StudentEntity> updateStudent(@RequestBody StudentEntity student, @PathVariable Long id){
        return new ResponseEntity<StudentEntity>(studentService.updateStudent(student, id), HttpStatus.OK);
    }
    //code for deleting
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return new ResponseEntity<String>("User Deleted", HttpStatus.OK);
    }

}
