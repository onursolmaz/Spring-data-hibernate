package org.renova.configuration;


import org.hibernate.jpa.HibernatePersistenceProvider;
import org.renova.facade.FacadeService;
import org.renova.service.DepartmentService;
import org.renova.service.LectureService;
import org.renova.service.StudentService;
import org.renova.service.TeacherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("org.renova")
public class ApplicationConfig {

    @Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setDataSource(dataSource());
        localContainerEntityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        localContainerEntityManagerFactoryBean.setPackagesToScan("org.renova");
        localContainerEntityManagerFactoryBean.setJpaProperties(hibernateProps());
        return localContainerEntityManagerFactoryBean;
    }

    @Bean
    DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/egitimdb?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    Properties hibernateProps() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        properties.setProperty("hibernate.show_sql", "false");
        // auto create table in DB
        properties.setProperty("hibernate.hbm2ddl.auto","update");
        return properties;
    }


    @Bean
    JpaTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }


    @Bean
    StudentService getStudentService(){
        return new StudentService();
    }

    @Bean
    TeacherService getTeacherService(){
        return new TeacherService();
    }

    @Bean
    DepartmentService getDepartmentService(){
        return new DepartmentService();
    }

    @Bean
    LectureService getLectureService(){
        return new LectureService();
    }

    @Bean
    FacadeService getFacedeService(){
        return new FacadeService();
    }









}
