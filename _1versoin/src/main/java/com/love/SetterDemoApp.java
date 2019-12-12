package com.love;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);

        BadFortuneService coach = context.getBean("badFortune",BadFortuneService.class);
        System.out.println(coach.getFortune());

        System.out.println(theCoach.getDailyWorkOut());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        context.close();

    }
}
