package com.StudentData.Application.controller;


import com.StudentData.Application.service.CoursesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vo.CoursesVO;

@RestController
@RequestMapping("/Courses")
public class CoursesController {

    private static final Logger LOG = LoggerFactory.getLogger(CoursesController.class);


//    @Autowired
    private CoursesService coursesService;

    @PostMapping(value="/create")
    public CoursesVO createCourses(CoursesVO coursesVO){
        LOG.info("createCourses: Creating the new Course in the curriculum for students");
        return coursesService.createCourses(coursesVO);
    }

    @PutMapping(value="/update")
    public CoursesVO updateCourses(CoursesVO coursesVO){
        LOG.info("updateCourses: Updating the changes to a existing Course");
        return coursesService.updateCourses(coursesVO);
    }

//    @GetMapping(value="/get/{academic_id}")
//    public CoursesVO getByStudentId(@PathVariable("studentId")int studentId){
//        return coursesService.getByStudentId(studentId);
//    }

}
