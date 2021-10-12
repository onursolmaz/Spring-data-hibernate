package org.renova.model.enums;

public enum Grade {
    PREPARATION(0),ONE(1), TWO(2), THREE(3), FOUR(4);

    int grade;
    Grade(int i) {
        grade=i;
    }

    public int getGrade() {
        return grade;
    }
}
