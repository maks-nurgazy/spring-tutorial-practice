package com.love.hibernate.demo;

import com.love.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CreateStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Student.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            Student maks = new Student("Samat","Kurmanbekov","samatos@gmail.com");
            session.beginTransaction();

            @SuppressWarnings("unchecked")
            List<Student> students = session.createQuery("from Student").list();

            for(Student temp : students)
            {
                System.out.println(temp);
            }

            session.getTransaction().commit();

        }finally {
            session.close();
        }

    }
}
