package com.StudentData.Application.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="student_info")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_Id", length = 11, nullable = false)
    private int studentId;

    @Column(name="first_Name",length=20,nullable = false)
    private String firstName;

    @Column(name="last_Name",length = 20,nullable = false)
    private String lastName;

    @Column(name="date_of_birth",nullable = true)
    private String dateOfBirth;

    @Column(name="gender",length=20,nullable = true)
    private String gender;

    @Column(name="date_Of_Join",length=20,nullable =true)
    private String  dateOfJoin;

    @Column(name="address",length=50,nullable = true)
    private String address;

    @Column(name="phone_number",length=10)
    private String phoneNumber;

    @OneToMany(mappedBy = "student")
    private List<EnrolledCourses> enrolledCoursesList;

    @OneToMany(mappedBy = "student")
    private List<Results> resultsList;

    public List<Results> getResultsList() {
        return resultsList;
    }

    public void setResultsList(List<Results> resultsList) {
        this.resultsList = resultsList;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(String dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<EnrolledCourses> getEnrolledCoursesList() {
        return enrolledCoursesList;
    }

    public void setEnrolledCoursesList(List<EnrolledCourses> enrolledCoursesList) {
        this.enrolledCoursesList = enrolledCoursesList;
    }


}
