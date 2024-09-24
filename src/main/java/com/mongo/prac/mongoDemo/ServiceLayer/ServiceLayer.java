package com.mongo.prac.mongoDemo.ServiceLayer;

import com.mongo.prac.mongoDemo.Model.Student;
import com.mongo.prac.mongoDemo.Repository.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {

    @Autowired
    private  MyRepo myRepo;


    public List<Student> getStudent(){
        return myRepo.findAll();
    }

    public void saveStudent(Student student){
        myRepo.save(student);
    }

    public void deleteStudent(String id){
        myRepo.deleteById(id);
    }


}
