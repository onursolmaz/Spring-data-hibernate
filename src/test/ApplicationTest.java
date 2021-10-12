import org.junit.Test;
import org.renova.configuration.ApplicationConfig;
import org.renova.model.entity.Department;
import org.renova.model.entity.Lecture;
import org.renova.model.entity.Student;
import org.renova.model.entity.Teacher;
import org.renova.model.enums.Grade;
import org.renova.model.enums.LectureCode;
import org.renova.service.DepartmentService;
import org.renova.service.LectureService;
import org.renova.service.StudentService;
import org.renova.service.TeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Set;

/*
Bu çalışmada Hibernate ve Spring data üzerinde çalışılıp ilişkisel veritabanı tasarlanmıştır.
Department-Student, Department-Teacher, Student-Lecture, Lecture-Teacher arasında ilişkiler kuruldu ve
bunlar üzerinden çeşitli işlemler yapıldı.

Deparment => Bölüme kayıtlı öğrenciler ve öğretmenler listelenebilir.

Teacher => Öğretmen birden çok ders açabilir.

Student => Öğrenci birden çok ders alabilir.

Lecture => Dersi veren öğretmen ve derse kayıtlı öğrenciler listlebilir

ders codu(string) ve öğrencinin kaçıncı sınıf(ordinal) olduğu bilgisi enum ile tanımlanmıştır.

 */


public class ApplicationTest {

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        DepartmentService departmentService=context.getBean(DepartmentService.class);
        StudentService studentService=context.getBean(StudentService.class);
        TeacherService teacherService=context.getBean(TeacherService.class);
        LectureService lectureService=context.getBean(LectureService.class);
        
        // Öncelikle sql scriptlerini çalıştırın veya exported_data altındaki verileri import edin.

        // x dersine kayıtlı öğrenciler ve dersi veren hoca
        Lecture lecture = lectureService.findByLectureCode(LectureCode.DATA_COMMUNICATION);
        System.out.println("Teacher's name: "+lecture.getTeacher().getName());

        Set<Student> enrolledStudents = lecture.getEnrolledStudents();
        for(Student student:enrolledStudents){
            System.out.println("Name: "  +student.getName()+ " "+ student.getSurname());
        }

        System.out.println("******");

        // 2.sınıfa giden öğrencilerin isimleri
        List<Student> studentList = studentService.findByGrade(Grade.TWO);
        for (Student student:studentList){
            System.out.println("Name: "  +student.getName()+ " "+ student.getSurname());
        }
        System.out.println("******");


        // X Bölümündeki öğrencileri yazdırma
        Department mathematicsDepartment = departmentService.findByName("Mechanical Engineering");
        System.out.println(mathematicsDepartment.getStudentList());

        System.out.println("******");

        // X Öğretmenin verdiği dersleri listeleme.
        Teacher teacher = teacherService.findByName("Murat tevfik");
        System.out.println(teacher.getGivenLectures());

        System.out.println("******");

        // X öğrecisinin aldığı dersler ve aldığı derslerin hocaları.
        Student student = studentService.findByName("Onur");
        Set<Lecture> takenLessons = student.getTakenLessons();
        for (Lecture lecturee:takenLessons){
            System.out.println(lecturee.getName()+" : "+lecturee.getTeacher());
        }

    }

}
