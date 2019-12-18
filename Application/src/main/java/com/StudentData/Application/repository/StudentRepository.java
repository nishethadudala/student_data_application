package com.StudentData.Application.repository;

import com.StudentData.Application.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Student findByStudentId(int studentId);
    public Student findByFirstName(String firstName);
}