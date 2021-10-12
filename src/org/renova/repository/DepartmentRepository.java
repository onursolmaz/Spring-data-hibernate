package org.renova.repository;


import org.renova.model.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends CrudRepository<Department,Long> {

    public Department findByName(String name);
}

