package com.love;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("swimCoach", Coach.class);

        Coach secondCoach = context.getBean("swimCoach", Coach.class);

        boolean result = (coach == secondCoach);
        System.out.println("pointing to the same object " + result);

        context.close();

    }
}
