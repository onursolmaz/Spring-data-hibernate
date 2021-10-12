package org.renova.service;


import org.renova.model.entity.Lecture;
import org.renova.model.enums.LectureCode;
import org.renova.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureService {

    @Autowired
    private LectureRepository lectureRepository;


    // CRUD METHODS

    public void save(Lecture lecture){
        lectureRepository.save(lecture);
    }

    public List<Lecture> findAll(){
        return (List<Lecture>) lectureRepository.findAll();
    }

    public Lecture findById(Long id){
        return lectureRepository.findById(id).get();
    }

    public Lecture findByLectureCode(LectureCode lectureCode){
        return lectureRepository.findByLectureCode(lectureCode);
    }


}
