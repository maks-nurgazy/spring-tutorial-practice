package com.love.coach;

import com.love.service.FortuneService;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Every morning 5 km run";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
