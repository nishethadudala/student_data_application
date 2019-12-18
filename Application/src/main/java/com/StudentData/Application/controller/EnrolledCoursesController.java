package com.StudentData.Application.controller;

import com.StudentData.Application.entity.Student;
import com.StudentData.Application.service.EnrolledCoursesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vo.EnrolledCoursesVO;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class EnrolledCoursesController {



    private static final Logger LOG = LoggerFactory.getLogger(EnrolledCoursesController.class);
    @Autowired
    private EnrolledCoursesService enrolledCoursesService;

    @PostMapping(value="/create")
    public EnrolledCoursesVO createEnrolledCourses(EnrolledCoursesVO enrolledCoursesVO, Student student){
        LOG.info("createEnrolledCourses: creating a new enrollment courses for new student");
        return enrolledCoursesService.createEnrolledCourses(enrolledCoursesVO, student);
    }

    @PutMapping(value="/update")
    public EnrolledCoursesVO updateEnrolledCourses(EnrolledCoursesVO enrolledCoursesVO, Student student){
        LOG.info("updateEnrolledCourses: updating a enrollment courses for existing student");
        return enrolledCoursesService.updateEnrolledCourses(enrolledCoursesVO, student);
    }

    @GetMapping(value="/getEnrolledCourses/{student_id}")
    public List<EnrolledCoursesVO> getEnrolledCourseByStudentId(@PathVariable("studentId") int studentId){
        LOG.info("getEnrolledCourseByStudentId: fetching a enrollment courses  List for a specific student by given student Id: {}");
        return enrolledCoursesService.getByStudentId(studentId);
    }


}
