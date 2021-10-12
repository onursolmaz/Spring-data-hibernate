package org.renova.repository;

import org.renova.model.entity.Lecture;
import org.renova.model.entity.Teacher;
import org.renova.model.enums.LectureCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRepository extends CrudRepository<Lecture,Long> {

    public Lecture findByLectureCode(LectureCode lectureCode);
}