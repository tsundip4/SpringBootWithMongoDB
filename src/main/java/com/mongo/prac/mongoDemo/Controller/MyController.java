package com.mongo.prac.mongoDemo.Controller;

import com.mongo.prac.mongoDemo.Model.Student;
import com.mongo.prac.mongoDemo.ServiceLayer.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private ServiceLayer serviceLayer;


    @GetMapping("/getAll")
    public List<Student> getDetail(){
        return serviceLayer.getStudent();
    }

    @PostMapping("/saveStudent")
    public void saveStd(@RequestBody Student student){
        serviceLayer.saveStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStd(@PathVariable String id){
        serviceLayer.deleteStudent(id);
    }



}
