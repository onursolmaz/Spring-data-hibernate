package org.renova.facade;

import org.renova.model.entity.*;
import org.renova.repository.DepartmentRepository;
import org.renova.repository.LectureRepository;
import org.renova.repository.StudentRepository;
import org.renova.repository.TeacherRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class FacadeService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private LectureRepository lectureRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;


    // enum ile refactor yapılabilir.
    public void save(BaseEntity entity) {
        if (entity.getClass().getSimpleName().equals(Student.class.getSimpleName())) {
            studentRepository.save((Student) entity);
        } else if (entity.getClass().getSimpleName().equals(Department.class.getSimpleName())) {
            departmentRepository.save((Department) entity);
        } else if (entity.getClass().getSimpleName().equals(Teacher.class.getSimpleName())) {
            teacherRepository.save((Teacher) entity);
        } else if (entity.getClass().getSimpleName().equals(Lecture.class.getSimpleName())) {
            lectureRepository.save((Lecture) entity);
        }
    }

    /*
    bu şekilde istediğimiz metotları yaratabiliriz.
    .
    .
    .
     */


}
