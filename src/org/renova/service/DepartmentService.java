package org.renova.service;

import org.renova.model.entity.Department;
import org.renova.model.entity.Teacher;
import org.renova.repository.DepartmentRepository;
import org.renova.repository.LectureRepository;
import org.renova.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private  DepartmentRepository departmentRepository;


    // CRUD METHODS

    public void save(Department department){
        departmentRepository.save(department);
    }

    public List<Department> findAll(){
        return (List<Department>) departmentRepository.findAll();
    }

    public Department findById(Long id){
        return departmentRepository.findById(id).get();
    }

    public Department findByName(String name){
        return departmentRepository.findByName(name);
    }

}
