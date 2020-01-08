package com.StudentData.Application.util;

import com.StudentData.Application.entity.Results;
import com.StudentData.Application.entity.Student;
import vo.ResultsVO;

public class ResultsUtil {

    public static ResultsVO populateResultsVO(Results results){
        ResultsVO resultsVO = new ResultsVO();
        resultsVO.setStudentId(results.getStudentId().getStudentId());
        resultsVO.setFull_name(results.getFull_name());
        resultsVO.setPhysics(results.getPhysics());
        resultsVO.setChemistry(results.getChemistry());
        resultsVO.setComputers(results.getComputers());
        resultsVO.setStudent_total(results.getStudent_total());
        resultsVO.setTerm_total(results.getTerm_total());
        resultsVO.setAverage(results.getAverage());
        resultsVO.setGrade(results.getGrade());
        resultsVO.setResults(results.getResults());

        return resultsVO;
    }

    public static Results populateResultsObj(ResultsVO resultsVO){
        Results results = new Results();

        Student student = new Student();
        student.setStudentId(resultsVO.getStudentId());
        results.setFull_name(resultsVO.getFull_name());
        results.setPhysics(resultsVO.getPhysics());
        results.setChemistry(resultsVO.getChemistry());
        results.setComputers(resultsVO.getComputers());
        results.setStudent_total(resultsVO.getStudent_total());
        results.setTerm_total(resultsVO.getTerm_total());
        results.setAverage(resultsVO.getAverage());
        results.setGrade(resultsVO.getGrade());
        results.setResults(resultsVO.getResults());

        return results;
    }

}
