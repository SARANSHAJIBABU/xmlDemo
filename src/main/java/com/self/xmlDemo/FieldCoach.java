package com.self.xmlDemo;

public class FieldCoach implements Coach{
    private FortuneService fortuneService;
    private String emailAddress;
    private String teamName;

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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
