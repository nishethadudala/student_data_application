package com.StudentData.Application.repository;

import com.StudentData.Application.entity.Courses;
import com.StudentData.Application.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesRepository extends JpaRepository<Courses,Integer> {

//   public List<Courses> getById(int studentId);
}
