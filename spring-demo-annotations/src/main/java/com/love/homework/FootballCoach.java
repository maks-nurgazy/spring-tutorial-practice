package com.love.homework;

import com.love.Coach;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "I love playing football with my F.R.I.E.N.D.S";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
