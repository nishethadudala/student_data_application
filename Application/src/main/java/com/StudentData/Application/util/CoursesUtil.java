package com.StudentData.Application.util;

import com.StudentData.Application.entity.Courses;
import vo.CoursesVO;

public class CoursesUtil {

    public static CoursesVO populateCoursesVO(Courses courses){
        CoursesVO coursesVO = new CoursesVO();
        coursesVO.setCourseId(courses.getCourseId());
        coursesVO.setCourseName(courses.getCourseName());
        coursesVO.setPracticals(courses.getPracticals());
        return coursesVO;
    }

    public static Courses populateCoursesObj(CoursesVO coursesVO){
        Courses courses = new Courses();
        courses.setCourseId(coursesVO.getCourseId());
        courses.setCourseName(coursesVO.getCourseName());
        courses.setPracticals(coursesVO.getPracticals());
        return courses;
    }
}
