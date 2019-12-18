package com.StudentData.Application.util;

import com.StudentData.Application.entity.Student;
import vo.StudentVO;


public class StudentUtil {

    public static StudentVO populateStudentVO(Student student) {
        StudentVO studentVO = new StudentVO();
        studentVO.setStudentId(student.getStudentId());
        studentVO.setFirstName(student.getFirstName());
        studentVO.setLastName(student.getLastName());
        studentVO.setDateOfBirth(student.getDateOfBirth());
        studentVO.setGender(student.getGender());
        studentVO.setDateOfJoin(student.getDateOfJoin());
        studentVO.setAddress(student.getAddress());
        studentVO.setPhoneNumber(student.getPhoneNumber());
        return studentVO;
    }


    public static Student populateStudentObject(StudentVO studentVO) {
        Student student = new Student();
        student.setStudentId(studentVO.getStudentId());
        student.setFirstName(studentVO.getFirstName());
        student.setLastName(studentVO.getLastName());
        student.setDateOfBirth(studentVO.getDateOfBirth());
        student.setGender(studentVO.getGender());
        student.setDateOfJoin(studentVO.getDateOfJoin());
        student.setAddress(studentVO.getAddress());
        student.setPhoneNumber(studentVO.getPhoneNumber());
        return student;
    }


}
