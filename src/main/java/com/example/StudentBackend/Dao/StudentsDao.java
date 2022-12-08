package com.example.StudentBackend.Dao;

import com.example.StudentBackend.Model.StudentsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentsDao extends CrudRepository<StudentsModel,Integer> {

    @Query(value = "SELECT `id`, `clg`, `name`, `rollno` FROM `student` WHERE `rollno`= :rollno",nativeQuery = true)
    List<StudentsModel> Searchstudent(@Param("rollno") Integer rollno);
}
