package com.StudentData.Application.repository;

import com.StudentData.Application.entity.Results;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultsRepository extends JpaRepository<Results,Integer> {


  public Results findById(int studentId);
}
