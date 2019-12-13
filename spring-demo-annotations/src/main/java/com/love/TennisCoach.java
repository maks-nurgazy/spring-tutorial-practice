package com.love;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "play tennis, love tennis";
    }
}
