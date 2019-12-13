package com.love;

import com.love.coach.Coach;
import com.love.coach.SwimCoach;
import com.love.config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaAnnotationApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());


        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());

        context.close();

    }
}
