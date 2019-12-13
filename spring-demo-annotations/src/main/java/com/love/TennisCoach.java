package com.love;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    private FortuneService fortuneService;

    //@Autowired this is an spring 4.3 feature it works
    TennisCoach(FortuneService theFortuneService)
    {
        fortuneService = theFortuneService;
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
