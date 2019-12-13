package com.love.config;

import com.love.coach.Coach;
import com.love.coach.SwimCoach;
import com.love.service.BadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.love.logger")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public BadFortuneService badFortuneService()
    {
        return new BadFortuneService();
    }
    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach(badFortuneService());
    }

}
