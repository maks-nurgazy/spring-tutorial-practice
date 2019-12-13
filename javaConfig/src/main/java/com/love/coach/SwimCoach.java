package com.love.coach;

import com.love.service.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach
{

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService theFortuneService)
    {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Swim 1000 meter per day is better for you";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }

    public String getEmail()
    {
        return email;
    }

    public String getTeam()
    {
        return team;
    }
}
