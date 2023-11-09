package com.uap.it1331l.studentgradeapi.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.uap.it1331l.studentgradeapi.model.Info;
import com.uap.it1331l.studentgradeapi.model.ratings;

@Mapper
public interface StudentMybatisRepository {
    
    @Insert("INSERT INTO student_info(studentId, studentName, comment, averageGrade) VALUES (#{studentId}, #{studentName}, #{comment}, #{averageGrade}) ") 
    public int insert (Info student_info);

    @Insert("INSERT INTO student_ratings(code, name, grade) VALUES (#{code}, #{name}, #{grade})")
    public int insertRating(ratings student_ratings);
}