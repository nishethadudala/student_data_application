package com.StudentData.Application.entity;

import javax.persistence.*;

@Entity
@Table(name="courses")
public class Courses {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="course_id",nullable = false)
    private int courseId;

    @Column(name="course_name",length = 23)
    private String courseName;

    @Column(name="practicals")
    private Boolean practicals;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Boolean getPracticals() {
        return practicals;
    }

    public void setPracticals(Boolean practicals) {
        this.practicals = practicals;
    }
}
