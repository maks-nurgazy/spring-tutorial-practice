package com.love.hibernate.demo;

import com.love.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Student.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            Student maks = new Student("Koldoshbek","Tashiev","suiunalievich@gmail.com");
            session.beginTransaction();
            session.save(maks);



            session.getTransaction().commit();

        }finally {
            session.close();
        }

    }
}
