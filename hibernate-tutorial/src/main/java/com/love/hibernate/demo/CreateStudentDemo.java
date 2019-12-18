package com.love.hibernate.demo;

import com.love.hibernate.entity.Course;
import com.love.hibernate.entity.Instructor;
import com.love.hibernate.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();

            Instructor beka = session.get(Instructor.class,2);


            System.out.println(beka.getCourses());


            System.out.println("Done very well!!!");

        } finally {
            session.close();
            factory.close();
        }

    }
}
