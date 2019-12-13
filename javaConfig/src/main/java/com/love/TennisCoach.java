package com.love;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    TennisCoach()
    {
        System.out.println("inside tennis def cons package private");
    }


    @Override
    public String getDailyWorkout()
    {
        return "play tennis, love tennis";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
