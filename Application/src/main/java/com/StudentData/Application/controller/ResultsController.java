package com.StudentData.Application.controller;

import com.StudentData.Application.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vo.ResultsVO;

import java.util.List;

@RestController
@RequestMapping("results")
public class ResultsController {

    @Autowired
    private ResultsService resultsService;


    @PostMapping("/create/studentResult")
    public ResultsVO createResults(@PathVariable("studentId") Integer studentId,@RequestBody ResultsVO resultsVO){
      resultsVO.setStudentId(studentId);
        return resultsService.createResults(resultsVO);
    }

    @PutMapping("/update/{student_id}/results")
    public ResultsVO updateResultsByStudentId (@RequestBody ResultsVO resultsVO,@PathVariable("studentId") Integer studentId){
        resultsVO.setStudentId(studentId);
        return resultsService.updateResultsByStudentId(resultsVO);
    }

    @GetMapping("/getALLResults")
    public List<ResultsVO> getAllStudentResults(){
        return resultsService.getAllStudentResults();
    }

    @GetMapping("/get/{studentId}/results")
    public List<ResultsVO> getResultsByStudentID(@PathVariable("studentId") Integer studentId){
        return resultsService.getResultsByStudentID(studentId);
    }
/*

    @DeleteMapping("/delete/{student_id}/results")
    public ResultsVO deleteByStudentId(ResultsVO resultsVO,@PathVariable("studentId") Integer studentId){
        return resultsService.deleteByStudentId(studentId);
    }
*/

}
