package com.azhagappan.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5 kilometre";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

}










