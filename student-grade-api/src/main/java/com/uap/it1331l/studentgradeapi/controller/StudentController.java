package com.uap.it1331l.studentgradeapi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uap.it1331l.studentgradeapi.model.Info;
import com.uap.it1331l.studentgradeapi.model.ratings;
import com.uap.it1331l.studentgradeapi.repository.StudentMybatisRepository;

@RestController
public class StudentController {
	@Autowired
	StudentMybatisRepository studentRepo;
	
	@PostMapping("/event/student")
    public Info addStudent(@RequestBody Info studentInfo) 
	{
		studentRepo.insert(studentInfo);
        float totalGrade = 0;
        for (ratings rating : studentInfo.getSubjectRatings()) 
        {
            totalGrade += rating.getGrade();
        }
        
        float averageGrade = totalGrade / studentInfo.getSubjectRatings().size();
        studentInfo.setAverageGrade(averageGrade);

        if (averageGrade >= 85) 
        {
            studentInfo.setComment("Within the maintaining average");
        } 
        else 
        {
            studentInfo.setComment("For Improvement");
        }

        return studentInfo;
    }
}
