package com.example.StudentBackend.Controller;

import com.example.StudentBackend.Dao.StudentsDao;
import com.example.StudentBackend.Model.StudentsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsController {
    @Autowired
    private StudentsDao dao;

    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")

    public String addstu(@RequestBody StudentsModel s){
        dao.save(s);
        return "add";
    }
    @GetMapping("/view")
    public List<StudentsModel> view(){
        return (List<StudentsModel>) dao.findAll();
    }
    @PostMapping("/search")
    public String search(){
        return "search";
    }
}
