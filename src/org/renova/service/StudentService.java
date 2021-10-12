package org.renova.service;


import org.renova.model.entity.Student;
import org.renova.model.enums.Grade;
import org.renova.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


//    CRUD METHODS
    public void save(Student student){
        studentRepository.save(student);
    }

    public List<Student> findAll(){
        return (List<Student>) studentRepository.findAll();
    }

    public Student findById(Long id){
        return studentRepository.findById(id).get();
    }

    public Student findByName(String name){
        return studentRepository.findByName(name);
    }

    public List<Student> findByGrade(Grade grade){
      return studentRepository.findByGrade(grade);
    }

}
