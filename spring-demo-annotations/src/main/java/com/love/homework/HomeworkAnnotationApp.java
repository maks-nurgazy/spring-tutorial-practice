package com.love.homework;

import com.love.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeworkAnnotationApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("footballCoach",Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();

    }
}
