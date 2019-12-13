package com.love.config;

import com.love.coach.Coach;
import com.love.coach.FootballCoach;
import com.love.service.FortuneService;
import com.love.service.NormalFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.love.logger")
public class FootballConfig {

    @Bean
    public FortuneService footballService()
    {
        return new NormalFortuneService();
    }

    @Bean
    public Coach footballCoach()
    {
        FootballCoach coach = new FootballCoach();
        coach.setFortuneService(footballService());
        return coach;
    }

}
