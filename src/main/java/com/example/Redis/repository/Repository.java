package com.example.Redis.repository;

import com.example.Redis.model.Student;
import org.springframework.data.repository.CrudRepository;
@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Student,String> {


}
