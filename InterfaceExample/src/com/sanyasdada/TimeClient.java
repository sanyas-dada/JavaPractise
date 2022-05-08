package com.sanyasdada;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface TimeClient {
	void setTime(int hour, int minute,int second);
	void setDate( int day, int month, int year);
	void setDateAndTime(int day, int month, int year, int hour, int minute, int second);
	LocalDateTime getLocalDateTime();

}
class SimpleTimeClient implements TimeClient{
    private LocalDateTime dateAndTime;
    
    public SimpleTimeClient() {
    	dateAndTime = LocalDateTime.now();
    	System.out.println("i am feelling good");
    	System.out.println("Stop being lectures infront of the people");
    	System.out.println("i am focused on my creativity and i use my imagination as much as you can while using my crativity");
    }
	@Override
	public void setTime(int hour, int minute, int second) {
		LocalDate currentDate = LocalDate.from(dateAndTime);
		LocalTime timeToSet = LocalTime.of(hour, minute,second);
		dateAndTime = LocalDateTime.of(currentDate, timeToSet);
		System.out.println(dateAndTime);
		
	}

	@Override
	public void setDate(int day, int month, int year) {
		LocalDate dateToSet  = LocalDate.of(day, month, year);
		LocalTime timeToSet =  LocalTime.from(dateToSet);
		dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
		System.out.println(dateAndTime);
	}

	@Override
	public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
		LocalDate dateToSet = LocalDate.of(day, month, year);
		LocalTime timeToSet = LocalTime.of(hour, minute, second);
		dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
	}

	@Override
	public LocalDateTime getLocalDateTime() {
		return dateAndTime;
	}
	public String toString() {
		return dateAndTime.toString();
	}
	
}
