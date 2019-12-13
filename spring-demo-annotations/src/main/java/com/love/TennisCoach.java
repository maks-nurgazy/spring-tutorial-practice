package com.love;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    private FortuneService fortuneService;

    TennisCoach()
    {
        System.out.println("inside tennis def cons package private");
    }

    //@Autowired this is an spring 4.3 feature it works
//    TennisCoach(FortuneService theFortuneService)
//    {
//        fortuneService = theFortuneService;
//    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Autowired is setting fortuneService");
        this.fortuneService = fortuneService;
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
