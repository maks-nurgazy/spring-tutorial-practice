package com.love;

public class CricketCoach implements Coach
{
    private FortuneService fortuneService;

//    public CricketCoach()
//    {
//        System.out.println("CricketCoach: inside no-are constructor");
//    }

    public void setFortuneService(FortuneService fortuneService)
    {
        System.out.println("CricketCoach: inside setter method constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut()
    {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
