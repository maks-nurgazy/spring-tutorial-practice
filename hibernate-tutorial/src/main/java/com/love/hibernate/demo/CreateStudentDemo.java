package com.love.hibernate.demo;

import com.love.hibernate.entity.Instructor;
import com.love.hibernate.entity.InstructorDetail;
import com.love.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Instructor.class)
                                .addAnnotatedClass(InstructorDetail.class)
                                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            Instructor instructor = new Instructor("Maksatbek","Bolushov","maksnurgazy@gmail.com");
            InstructorDetail detail = new InstructorDetail("youtube.com/bekanur","CODING");

            instructor.setInstructorDetail(detail);

            session.beginTransaction();
            System.out.println("Saving instructor..."+instructor);
            session.save(instructor);

            session.getTransaction().commit();

            System.out.println("Done very well!!!");

        }finally {
            session.close();
        }

    }
}
