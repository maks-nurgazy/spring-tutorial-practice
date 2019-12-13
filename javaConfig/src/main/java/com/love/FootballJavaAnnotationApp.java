package com.love;

import com.love.coach.Coach;
import com.love.config.FootballConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FootballJavaAnnotationApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(FootballConfig.class);

        Coach footballCoach = context.getBean("footballCoach",Coach.class);

        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(footballCoach.getDailyFortune());

    }
}
