package org.renova.model.entity;

import org.renova.model.enums.LectureCode;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "lecture")
public class Lecture extends BaseEntity {

    @ManyToOne
    private Teacher teacher;

    // when use FetchType.LAZY, you can't reach enrolledStudents by Lecture
    @ManyToMany(mappedBy = "takenLessons",fetch = FetchType.EAGER)
    private Set<Student> enrolledStudents;

    @Enumerated(EnumType.STRING)
    private LectureCode lectureCode;

// GETTERS and SETTERS

    public LectureCode getLectureCode() {
        return lectureCode;
    }

    public void setLectureCode(LectureCode lectureCode) {
        this.lectureCode = lectureCode;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Set<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(Set<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    @Override
    public String toString() {
        return this.getName();

    }
}
