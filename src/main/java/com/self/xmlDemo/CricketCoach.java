package com.self.xmlDemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getTodaysWorkout() {
        return "Bat for 5 hours";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
