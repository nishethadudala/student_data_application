package com.StudentData.Application.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="results")
public class Results implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="result_id",length=11,nullable = true)
    private int resultId;


    @Column(name="full_name",length = 20,nullable = false)
    private String full_name;

    @Column(name="Physics",length = 11,nullable = false)
    private int  Physics;

    @Column(name="Chemistry",length = 11,nullable = false)
    private int   Chemistry;

    @Column(name="Computers",length = 11,nullable = false)
    private int  Computers;

    @Column(name="student_total",length = 11,nullable = false)
    private int  student_total;

    @Column(name="term_total",length = 11,nullable = false)
    private int  term_total;

    @Column(name="average",length = 11,nullable = false)
    private int  average;

    @Column(name="grade",length = 11,nullable = false)
    private String  grade;

    @Column(name="results",length = 30,nullable = false)
    private String results;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;


    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getPhysics() {
        return Physics;
    }

    public void setPhysics(int physics) {
        Physics = physics;
    }


    public int getChemistry() {
        return Chemistry;
    }

    public void setChemistry(int chemistry) {
        Chemistry = chemistry;
    }

    public int getComputers() {
        return Computers;
    }

    public void setComputers(int computers) {
        Computers = computers;
    }

    public int getStudent_total() {
        return student_total;
    }

    public void setStudent_total(int student_total) {
        this.student_total = student_total;
    }

    public int getTerm_total() {
        return term_total;
    }

    public void setTerm_total(int term_total) {
        this.term_total = term_total;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public Student getStudentId() {
        return student;
    }

    public void setStudentId(Student studentId) {
        this.student = student;
    }



}
