package org.renova.model.enums;

public enum LectureCode {
    DATA_MINING("CME-421"),
    PROGRAMING_LANGUAGES("CME-110"),
    COMPUTER_ARCHITECTURE("CME-302"),
    DATA_COMMUNICATION("CME-210"),
    WEB_BASED_PROGRAMING("CME-230"),
    OBJECT_ORIENTED_PROGRAMING("CME-235"),
    MATHEMATICS("CME-105"),
    ;

    String lessonCode;
    LectureCode(String lessonCode) {
        this.lessonCode=lessonCode;
    }

    public String  getCode(){
        return lessonCode;
    }
}

