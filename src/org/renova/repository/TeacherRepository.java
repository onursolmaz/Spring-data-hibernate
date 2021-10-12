package org.renova.repository;

import org.renova.model.entity.Department;
import org.renova.model.entity.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher,Long> {

    public Teacher findByName(String name);
}


