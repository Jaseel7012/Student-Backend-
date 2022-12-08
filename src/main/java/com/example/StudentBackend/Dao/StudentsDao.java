package com.example.StudentBackend.Dao;

import com.example.StudentBackend.Model.StudentsModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentsDao extends CrudRepository<StudentsModel,Integer> {
}
