package org.renova.facade;


import org.renova.configuration.ApplicationConfig;
import org.renova.model.entity.Department;
import org.renova.model.entity.Lecture;
import org.renova.model.entity.Student;
import org.renova.model.entity.Teacher;
import org.renova.model.enums.LectureCode;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.HashSet;

/*
                                FACADE DESING PATTERN
Bu tasarım kalıbı yardımıyla aynı sınıfı implement eden classları tek çatı altına topluyor ve karmaşayı azaltıyoruz.
Facade bize bir alt sistemlerin dahil edildiği bir arayüz sağlar ve biz o arayüz üzerinden işlemlerimizi gerçekleştiririz.
Kullanıcı tüm repositoryleri kullanmak yerine tek bir sınıf ile belirli işlemleri daha kolay yapabilir.

+ Tek bir save methoduyla hangi tipde entity gelirse gelsin veritabanına kaydedilmesi sağlanmıştır

*/


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        FacadeService facadeService = context.getBean(FacadeService.class);

        Department softwareEngineeringDepartment = new Department();
        softwareEngineeringDepartment.setName("Software Engineering");
        facadeService.save(softwareEngineeringDepartment);


        Lecture springMvcLecture = new Lecture();
        springMvcLecture.setName("Spring MVC");
        springMvcLecture.setLectureCode(LectureCode.WEB_BASED_PROGRAMING);


        Teacher teacher = new Teacher();
        teacher.setName("Mehmet Burak Ak");
        teacher.setDepartment(softwareEngineeringDepartment);
        teacher.setGivenLectures(new HashSet<>(Arrays.asList(springMvcLecture)));

        Student stundent = new Student();
        stundent.setName("Taha");
        stundent.setSurname("Demir");
        stundent.setStudentNo("123");
        stundent.setDepartment(softwareEngineeringDepartment);
        stundent.setTakenLessons(new HashSet<>(Arrays.asList(springMvcLecture)));

        facadeService.save(softwareEngineeringDepartment);
        facadeService.save(springMvcLecture);
        facadeService.save(teacher);
        facadeService.save(stundent);

    }
}
