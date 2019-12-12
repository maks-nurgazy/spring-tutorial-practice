package com.love;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach",TrackCoach.class);

        System.out.println(theCoach.getDailyWorkOut());

        context.close();
    }
}
