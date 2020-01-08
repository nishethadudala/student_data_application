package com.StudentData.Application.service;
import com.StudentData.Application.entity.Results;
import com.StudentData.Application.entity.Student;
import com.StudentData.Application.repository.ResultsRepository;
import com.StudentData.Application.repository.StudentRepository;
import com.StudentData.Application.util.ResultsUtil;
import com.StudentData.Application.util.StudentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.ResultsVO;

import java.util.ArrayList;
import java.util.List;


@Service
public class ResultsService {


    @Autowired
    private ResultsRepository resultsRepository;

    @Autowired
    private StudentRepository studentRepository;

    public ResultsVO createResults(ResultsVO resultsVO) {
        return ResultsUtil.populateResultsVO(resultsRepository.save(ResultsUtil.populateResultsObj(resultsVO)));
    }

    public ResultsVO updateResultsByStudentId(ResultsVO resultsVO) {
        Results results = resultsRepository.findById(resultsVO.getStudentId());
        if (resultsVO != null && resultsVO.getStudentId() != 0) {
            Student student = studentRepository.findByStudentId(resultsVO.getStudentId());
        }

            results.setFull_name(resultsVO.getFull_name());
            results.setPhysics(resultsVO.getPhysics());
            results.setChemistry(resultsVO.getChemistry());
            results.setComputers(resultsVO.getComputers());
            results.setStudent_total(resultsVO.getStudent_total());
            results.setTerm_total(resultsVO.getTerm_total());
            results.setAverage(resultsVO.getAverage());
            results.setGrade(resultsVO.getGrade());
            results.setResults(resultsVO.getResults());
            return ResultsUtil.populateResultsVO(resultsRepository.save(results));
    }

    public List<ResultsVO> getAllStudentResults() {
        List<ResultsVO> resultsVOList = new ArrayList<>();
       List<Results>  results = resultsRepository.findAll();
        if (!results.isEmpty()) {
            for (Results results1 : results) {
                resultsVOList.add(ResultsUtil.populateResultsVO(results1));
            }
        }
        return resultsVOList;
    }




    public List<ResultsVO> getResultsByStudentID(Integer studentId) {

        List<ResultsVO> resultsVOList = new ArrayList<>();
        Student student = studentRepository.findByStudentId(studentId);
        List<Results> resultsList = student.getResultsList();
        for (Results results : resultsList) {
            //convert scope to scopevo
            resultsVOList.add(ResultsUtil.populateResultsVO(results));
        }
        return resultsVOList;
    }

}
