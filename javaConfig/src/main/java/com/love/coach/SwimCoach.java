package com.love.coach;

import com.love.service.FortuneService;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService)
    {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meter per day is better for you";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
