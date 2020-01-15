package com.self.xmlDemo;

public class FieldCoach implements Coach{
    private FortuneService fortuneService;

    public FieldCoach() {
    }

    @Override
    public String getTodaysWorkout() {
        return "Run 5 km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
