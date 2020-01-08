package com.StudentData.Application.service;


import com.StudentData.Application.entity.Student;
import com.StudentData.Application.repository.EnrolledCoursesRepository;
import com.StudentData.Application.util.EnrolledCoursesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.EnrolledCoursesVO;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnrolledCoursesService {

    private static final Logger LOG = LoggerFactory.getLogger(EnrolledCoursesService.class);

    @Autowired
    private EnrolledCoursesRepository enrolledCoursesRepository;

    public EnrolledCoursesVO createEnrolledCourses(EnrolledCoursesVO enrolledCoursesVO) {
        LOG.info("createEnrolledCourses: creating a new enrollment courses for new student");
        return EnrolledCoursesUtil.populateEnrolledCoursesVO(enrolledCoursesRepository.save(EnrolledCoursesUtil.populateEnrolledCoursesObj(enrolledCoursesVO)));
    }

    public EnrolledCoursesVO updateEnrolledCourses(EnrolledCoursesVO enrolledCoursesVO) {
        LOG.info("updateEnrolledCourses: updating a enrollment courses for existing student");
        return EnrolledCoursesUtil.populateEnrolledCoursesVO(enrolledCoursesRepository.save(EnrolledCoursesUtil.populateEnrolledCoursesObj(enrolledCoursesVO)));
    }

    public List<EnrolledCoursesVO> getByStudentId(int studentId) {
        LOG.info("getEnrolledCourseByStudentId: fetching a enrollment courses  List for a specific student by given student Id: {}",studentId);
        List<EnrolledCoursesVO> enrolledCoursesVOList = new ArrayList<>();
        return enrolledCoursesVOList;
    }
}
