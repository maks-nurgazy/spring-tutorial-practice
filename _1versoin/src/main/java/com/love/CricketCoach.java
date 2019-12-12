package com.love;

public class CricketCoach implements Coach
{
    private FortuneService fortuneService;

    private String emailAddress;
    private String team;


//    public CricketCoach()
//    {
//        System.out.println("CricketCoach: inside no-are constructor");
//    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getTeam()
    {
        return team;
    }

    public void setFortuneService(FortuneService fortuneService)
    {
        System.out.println("CricketCoach: inside setter method constructor");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress)
    {
        System.out.println("CricketCoach: inside setter method setEMail");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team)
    {
        System.out.println("CricketCoach: inside setter method setTeam");
        this.team = team;
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
