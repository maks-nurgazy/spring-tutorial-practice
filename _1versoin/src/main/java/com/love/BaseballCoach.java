package com.love;

public class BaseballCoach implements Coach
{
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkOut()
    {
        return "Spend 50 minutes on batting practice";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
