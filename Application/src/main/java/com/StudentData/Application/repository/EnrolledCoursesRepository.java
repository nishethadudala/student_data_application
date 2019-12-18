package com.StudentData.Application.repository;


import com.StudentData.Application.entity.EnrolledCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolledCoursesRepository extends JpaRepository<EnrolledCourses,Integer> {

//   public EnrolledCourses findByAcademicsId(int academicsId);
}
