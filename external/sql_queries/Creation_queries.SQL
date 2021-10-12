# written for MYSQL database
CREATE TABLE "department"
(
    "id"   bigint NOT NULL AUTO_INCREMENT,
    "name" varchar(255) DEFAULT NULL,
     PRIMARY KEY ("id")
) ENGINE = InnoDB;


CREATE TABLE "student"
(
    "id"            bigint       NOT NULL AUTO_INCREMENT,
    "name"          varchar(255) NOT NULL,
    "surname"       varchar(255) NOT NULL,
    "grade"         int    DEFAULT NULL,
    "student_no"    varchar(255) NOT NULL,
    "department_id" bigint DEFAULT NULL,
    PRIMARY KEY ("id"),
    KEY ("department_id"),
    FOREIGN KEY ("department_id") REFERENCES "department" ("id")
) ENGINE = InnoDB;


CREATE TABLE "lecture"
(
    "id"          bigint NOT NULL AUTO_INCREMENT,
    "lectureCode" varchar(255) DEFAULT NULL,
    "name"        varchar(255) DEFAULT NULL,
    "teacher_id"  bigint       DEFAULT NULL,
    PRIMARY KEY ("id"),
    KEY ("teacher_id"),
    FOREIGN KEY ("teacher_id") REFERENCES "teacher" ("id")
) ENGINE = InnoDB;


CREATE TABLE "teacher"
(
    "id"            bigint NOT NULL AUTO_INCREMENT,
    "name"          varchar(255) DEFAULT NULL,
    "department_id" bigint       DEFAULT NULL,
    PRIMARY KEY ("id"),
    KEY ("department_id"),
    FOREIGN KEY ("department_id") REFERENCES "department" ("id")
) ENGINE = InnoDB;


CREATE TABLE "student_subjects"
(
    "student_id" bigint NOT NULL,
    "subject_id" bigint NOT NULL,
    KEY ("subject_id"),
    KEY ("student_id"),
    FOREIGN KEY ("student_id") REFERENCES "student" ("id"),
    FOREIGN KEY ("subject_id") REFERENCES "lecture" ("id")
) ENGINE = InnoDB;


