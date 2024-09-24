package com.mongo.prac.mongoDemo.Repository;

import com.mongo.prac.mongoDemo.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepo extends MongoRepository<Student, Integer> {

    void deleteById(String id);

}
