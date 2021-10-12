package org.renova.repository;

import org.renova.model.entity.Student;
import org.renova.model.entity.Teacher;
import org.renova.model.enums.Grade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {

    public Student findByName(String name);
    public List<Student> findByGrade(Grade grade);

}
