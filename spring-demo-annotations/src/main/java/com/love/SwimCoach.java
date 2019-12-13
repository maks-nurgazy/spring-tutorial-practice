package com.love;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SwimCoach implements Coach {
    private static int number = 1;
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    public SwimCoach() {
        System.out.println("swim constuctor " + number);
        number++;
    }

    @PostConstruct
    public void myPostMethod()
    {
        System.out.println("this is a post method");
    }

    @PreDestroy
    public void myPreMethod()
    {
        System.out.println("This is a pre method");
    }


    @Override
    public String getDailyWorkout() {
        return email;
    }

    @Override
    public String getDailyFortune() {
        return team;
    }
}
