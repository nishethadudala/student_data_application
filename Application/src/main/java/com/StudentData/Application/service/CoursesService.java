package com.StudentData.Application.service;

import com.StudentData.Application.repository.CoursesRepository;
import com.StudentData.Application.util.CoursesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import vo.CoursesVO;

import java.util.List;

public class CoursesService {

    @Autowired
    private CoursesRepository coursesRepository;

    private static final Logger LOG = LoggerFactory.getLogger(CoursesService.class);


    public CoursesVO createCourses(CoursesVO coursesVO) {
        LOG.info("createCourses: Creating the new Course in the curriculum for students");
        return CoursesUtil.populateCoursesVO(coursesRepository.save(CoursesUtil.populateCoursesObj(coursesVO)));
    }

    public CoursesVO updateCourses(CoursesVO coursesVO) {
        LOG.info("updateCourses: Updating the changes to a existing Course");
        return CoursesUtil.populateCoursesVO(coursesRepository.save(CoursesUtil.populateCoursesObj(coursesVO)));
    }

//    public List<CoursesVO> getByStudentId(int studentId) {
//        return CoursesUtil.populateCoursesVO(coursesRepository.getById(studentId));
//    }
}
