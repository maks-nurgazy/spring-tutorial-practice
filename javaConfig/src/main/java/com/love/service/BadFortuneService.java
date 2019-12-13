package com.love.service;

public class BadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a bad day";
    }
}
