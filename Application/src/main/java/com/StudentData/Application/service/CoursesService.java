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


    public CoursesVO createCourses(CoursesVO coursesVO) {
        return CoursesUtil.populateCoursesVO(coursesRepository.save(CoursesUtil.populateCoursesObj(coursesVO)));
    }

    public CoursesVO updateCourses(CoursesVO coursesVO) {
        return CoursesUtil.populateCoursesVO(coursesRepository.save(CoursesUtil.populateCoursesObj(coursesVO)));
    }
}
