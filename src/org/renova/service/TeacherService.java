package org.renova.service;


import org.renova.model.entity.Teacher;
import org.renova.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;


    // CRUD METHODS
    public void save(Teacher teacher){
        teacherRepository.save(teacher);
    }

    public List<Teacher> findAll(){
       return (List<Teacher>) teacherRepository.findAll();
    }

    public Teacher findById(Long id){
       return teacherRepository.findById(id).get();
    }
    public Teacher findByName(String name){
        return teacherRepository.findByName(name);
    }

}
