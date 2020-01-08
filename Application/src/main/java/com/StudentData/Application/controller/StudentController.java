package com.StudentData.Application.controller;

import com.StudentData.Application.repository.CoursesRepository;
import com.StudentData.Application.service.EnrolledCoursesService;
import com.StudentData.Application.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vo.StudentVO;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @Autowired
    EnrolledCoursesService enrolledCoursesService;

    @Autowired
    CoursesRepository coursesRepository;

    private static final Logger LOG = LoggerFactory.getLogger(StudentController.class);


    @PostMapping(value = "/create")
    public StudentVO createStudent(@RequestBody StudentVO studentVO) {
        LOG.info("createStudent: Creating the new joined student information");
        return  studentService.createStudent(studentVO);
    }

    @PutMapping(value = "/update")
    public StudentVO updateStudent(@RequestBody StudentVO studentVO) {
        LOG.info("updateStudent: Updating the existing student information");
        return studentService.updateStudent(studentVO);
    }

    @DeleteMapping(value = "/{studentId}/delete")
    public void deleteStudents(@PathVariable("studentId") Integer studentId) {
        studentService.deleteByStudentId(studentId);
    }

    @GetMapping(value = "/{studentId}/get")
    public StudentVO getByStudentId(@PathVariable("studentId") Integer studentId) {
        LOG.info("getByStudentId: fetching a Student information for a specific student by given student Id: {}",studentId);
        return studentService.getByStudentId(studentId);
    }

    @GetMapping(value = "/students/{firstName}/get")
    public StudentVO getByFirstName(@PathVariable("firstName") String firstName) {
        LOG.info("getByFirstName: fetching a Student information for a specific student by given firstName: {}",firstName);
        return studentService.getByFirstName(firstName);
    }

    @GetMapping(value = "/findAll")
    public List<StudentVO> getStudents() {
        return studentService.getStudentsList();
    }

}


