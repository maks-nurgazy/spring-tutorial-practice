package com.love;

public class TrackCoach implements Coach
{
    FortuneService fortuneService;

    public TrackCoach()
    {

    }


    public TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut()
    {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }

    // init method
    public void doMystartUpStuff()
    {
        System.out.println("TrackCouch: inside method doMystartUpStuff");
    }

    // destroy method
    public void doMyCleanupStuffYoYo()
    {
        System.out.println("TrackCouch: inside method doMyCleanupStuffYoYo");
    }

}
