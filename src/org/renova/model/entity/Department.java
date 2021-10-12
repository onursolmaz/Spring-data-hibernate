package org.renova.model.entity;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "DEPARTMENT")
public class Department extends BaseEntity {


    @OneToMany(mappedBy="department",fetch = FetchType.EAGER)
    private Set<Student> studentList=new HashSet<>();

    @OneToMany(mappedBy="department",fetch = FetchType.EAGER)
    private Set<Teacher> teacherList=new HashSet<>();

//    GETTERS and SETTER

    public Set<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Set<Student> studentList) {
        this.studentList = studentList;
    }

    public Set<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(Set<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
