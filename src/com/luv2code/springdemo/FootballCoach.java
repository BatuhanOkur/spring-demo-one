package com.luv2code.springdemo;

public class FootballCoach implements Coach {
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend one hour on penalty practice";
	}

	@Override
	public String getDailyFortune() {
		
		return "Football Coach: " + fortuneService.getFortune();
	}

}
