package com.StudentData.Application.util;

import com.StudentData.Application.entity.EnrolledCourses;
import com.StudentData.Application.entity.Student;
import vo.EnrolledCoursesVO;

public class EnrolledCoursesUtil {

    public static EnrolledCoursesVO populateEnrolledCoursesVO(EnrolledCourses  enrolledCourses){
        EnrolledCoursesVO enrolledCoursesVO = new EnrolledCoursesVO();
        enrolledCoursesVO.setStudentCourseEnrollmentId(enrolledCourses.getStudentCourseEnrollmentId());
        enrolledCoursesVO.setCourseId(enrolledCourses.getCourseId());
        enrolledCoursesVO.setEnrolledDate(enrolledCourses.getEnrolledDate());
        enrolledCoursesVO.setStudentId(enrolledCourses.getStudent().getStudentId());
        return enrolledCoursesVO;
    }

    public static EnrolledCourses populateEnrolledCoursesObj(EnrolledCoursesVO enrolledCoursesVO){
        EnrolledCourses enrolledCourses = new EnrolledCourses();
        enrolledCourses.setStudentCourseEnrollmentId(enrolledCoursesVO.getStudentCourseEnrollmentId());
        enrolledCourses.setCourseId(enrolledCoursesVO.getCourseId());
        enrolledCourses.setEnrolledDate(enrolledCoursesVO.getEnrolledDate());
        Student student = new Student();
        enrolledCourses.setStudent(student);
        return enrolledCourses;
    }

}
