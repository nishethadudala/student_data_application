package com.StudentData.Application.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="enrolled_courses")
public class EnrolledCourses implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_course_enrollment_id",nullable = false)
    private int studentCourseEnrollmentId;

    @Column(name="enrolled_date")
    private Date enrolledDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    @JsonBackReference
    private Courses courseId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = true)
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getStudentCourseEnrollmentId() {
        return studentCourseEnrollmentId;
    }

    public void setStudentCourseEnrollmentId(int studentCourseEnrollmentId) {
        this.studentCourseEnrollmentId = studentCourseEnrollmentId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(Date enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    public Courses getCourseId() {
        return courseId;
    }

    public void setCourseId(Courses courseId) {
        this.courseId = courseId;
    }
}
