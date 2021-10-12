-- NEW DEPARMENTS
INSERT INTO egitimdb.department (id, name)
VALUES (1, 'Computer Engineering ');

INSERT INTO egitimdb.department (id, name)
VALUES (2, 'Mechanical Engineering');

INSERT INTO egitimdb.department (id, name)
VALUES (3, 'PHYSICS');

INSERT INTO egitimdb.department (id, name)
VALUES (4, 'MATHEMATICS');

-- NEW STUDENTS
INSERT INTO egitimdb.student (id, name, grade, student_no, surname, department_id)
VALUES (1, 'Onur', 2, '2064', 'Solmaz', 1);

INSERT INTO egitimdb.student (id, name, grade, student_no, surname, department_id)
VALUES (2, 'Berna', 2, '2065', 'Kurtal', 2);

INSERT INTO egitimdb.student (id, name, grade, student_no, surname, department_id)
VALUES (3, 'Semih', 2, '1023', 'Arslan', 3);

INSERT INTO egitimdb.student (id, name, grade, student_no, surname, department_id)
VALUES (4, 'Bilge', 4, '3042', 'Yılmaz', 4);

INSERT INTO egitimdb.student (id, name, grade, student_no, surname, department_id)
VALUES (5, 'Ahmet', 3, '1110', 'Tekin', 3);

INSERT INTO egitimdb.student (id, name, grade, student_no, surname, department_id)
VALUES (6, 'Mehmet', 1, '1201', 'Yıldırım', 2);

INSERT INTO egitimdb.student (id, name, grade, student_no, surname, department_id)
VALUES (7, 'Büşra', 4, '9501', 'Kuzu', 1);

-- NEW TEACHERS
INSERT INTO egitimdb.teacher (id, name, department_id)
VALUES (2, 'Kasım Öz', 2);

INSERT INTO egitimdb.teacher (id, name, department_id)
VALUES (3, 'Murat tevfik', 3);

INSERT INTO egitimdb.teacher (id, name, department_id)
VALUES (4, 'Ümit Atilla', 2);

INSERT INTO egitimdb.teacher (id, name, department_id)
VALUES (5, 'Sami Yılmaz', 4);

INSERT INTO egitimdb.teacher (id, name, department_id)
VALUES (6, 'Ahmet Türk', 1);

INSERT INTO egitimdb.teacher (id, name, department_id)
VALUES (7, 'Adnan Erdursun', 1);

INSERT INTO egitimdb.teacher (id, name, department_id)
VALUES (8, 'Nesrin asan', 3);

INSERT INTO egitimdb.teacher (id, name, department_id)
VALUES (9, 'Ümit coskun', 3);

INSERT INTO egitimdb.teacher (id, name, department_id)
VALUES (10, 'Ahmet yıldız', 4);

-- NEW LECTURES
INSERT INTO egitimdb.lecture (id, name, lectureCode, teacher_id)
VALUES (3, 'Programing Languages', 'PROGRAMING_LANGUAGES', 3);

INSERT INTO egitimdb.lecture (id, name, lectureCode, teacher_id)
VALUES (4, 'Web based programing', 'WEB_BASED_PROGRAMING', 4);

INSERT INTO egitimdb.lecture (id, name, lectureCode, teacher_id)
VALUES (5, 'Mathematics', 'MATHEMATICS', 2);

INSERT INTO egitimdb.lecture (id, name, lectureCode, teacher_id)
VALUES (6, 'Computer Architecture', 'COMPUTER_ARCHITECTURE', 7);

INSERT INTO egitimdb.lecture (id, name, lectureCode, teacher_id)
VALUES (7, 'Data Mining', '  DATA_MINING', 5);

-- new enrolled student. relations student-lecture

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (1, 1);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (1, 2);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (1, 5);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (1, 7);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (2, 3);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (2, 4);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (2, 6);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (2, 2);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (3, 2);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (3, 1);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (3, 3);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (3, 4);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (3, 5);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (3, 6);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (4, 6);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (4, 7);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (5, 1);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (5, 5);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (5, 3);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (5, 7);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (6, 2);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (6, 3);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (6, 6);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (7, 1);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (7, 5);

INSERT INTO egitimdb.student_lecture (student_id, lecture_id)
VALUES (7, 3);



