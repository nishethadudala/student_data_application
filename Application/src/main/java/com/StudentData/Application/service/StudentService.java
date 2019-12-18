package com.StudentData.Application.service;

import com.StudentData.Application.entity.EnrolledCourses;
import com.StudentData.Application.entity.Student;
import com.StudentData.Application.repository.CoursesRepository;
import com.StudentData.Application.repository.EnrolledCoursesRepository;
import com.StudentData.Application.repository.StudentRepository;
import com.StudentData.Application.util.StudentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.StudentVO;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    EnrolledCoursesService enrolledCoursesService;

    @Autowired
    EnrolledCoursesRepository enrolledCoursesRepository;

    @Autowired
    CoursesRepository coursesRepository;



    public StudentVO createStudent(StudentVO studentVO) {
        Student student = studentRepository.save(StudentUtil.populateStudentObject(studentVO));
        List<Integer> coursesList = studentVO.getCoursesList();
        if(!coursesList.isEmpty() && coursesList.size() > 0) {
            for(Integer courseId : coursesList) {
                EnrolledCourses enrolledCourses = new EnrolledCourses();
                enrolledCourses.setCourseId(coursesRepository.findById(courseId).get());
                enrolledCourses.setStudent(student);
                enrolledCoursesRepository.save(enrolledCourses);
            }
        }
        StudentVO studentVO1 = StudentUtil.populateStudentVO(student);
        studentVO1.setCoursesList(studentVO.getCoursesList());
        return studentVO1;
    }

    public StudentVO updateStudent(StudentVO studentVO) {
        return StudentUtil.populateStudentVO(studentRepository.save(StudentUtil.populateStudentObject(studentVO)));
    }

    public void deleteByStudentId(Integer studentId) {
        studentRepository.deleteById(studentId);
    }

    public StudentVO getByStudentId(Integer studentId) {
        return StudentUtil.populateStudentVO(studentRepository.findByStudentId(studentId));
    }

    public StudentVO getByFirstName(String firstName) {
        return StudentUtil.populateStudentVO(studentRepository.findByFirstName(firstName));
    }

    public List<StudentVO> getStudentsList() {
        List<StudentVO> studentVOList = new ArrayList<>();
        List<Student> students = studentRepository.findAll();
        if (!students.isEmpty()) {
            for (Student student : students) {
                studentVOList.add(StudentUtil.populateStudentVO(student));
            }
        }
        return studentVOList;
    }

}
