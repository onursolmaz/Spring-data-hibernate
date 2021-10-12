package org.renova.model.entity;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TEACHER")
public class Teacher extends BaseEntity {


    @ManyToOne
    private Department department;


    @OneToMany(mappedBy="teacher",fetch = FetchType.EAGER)
    private Set<Lecture> givenLectures;

    public Set<Lecture> getGivenLectures() {
        return givenLectures;
    }

    public void setGivenLectures(Set<Lecture> givenLectures) {
        this.givenLectures = givenLectures;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return this.getName();

    }
}
