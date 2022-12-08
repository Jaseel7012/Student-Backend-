package com.example.StudentBackend.Controller;

import com.example.StudentBackend.Dao.StudentsDao;
import com.example.StudentBackend.Model.StudentsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {
    @Autowired
    private StudentsDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")

    public String addstu(@RequestBody StudentsModel s){
        dao.save(s);
        return "add";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<StudentsModel> view(){
        return (List<StudentsModel>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<StudentsModel> search(@RequestBody StudentsModel s){
        String roll_no=String.valueOf(s.getRollno());
        System.out.println(roll_no);
        return  ( List<StudentsModel>) dao.Searchstudent(s.getRollno());



    }
}
