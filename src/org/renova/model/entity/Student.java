package org.renova.model.entity;


import org.renova.model.enums.Grade;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "STUDENT")
public class Student extends BaseEntity {

    @Column(name = "student_no", nullable = false)
    private String studentNo;

    @Column(name = "surname", nullable = false)
    private String surname;

    @ManyToOne
    private Department department;

    @Enumerated(EnumType.ORDINAL)
    private Grade grade;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "student_lecture",
            joinColumns = { @JoinColumn(name = "student_id") },
            inverseJoinColumns = { @JoinColumn(name = "lecture_id") }
    )
    private Set<Lecture> takenLessons;

    public Set<Lecture> getTakenLessons() {
        return takenLessons;
    }

    public void setTakenLessons(Set<Lecture> takenLessons) {
        this.takenLessons = takenLessons;
    }

// Getters and Setters

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +this.getName()+" "+surname+" student no: "+ studentNo +" Department: " +department+" }";
    }


}
