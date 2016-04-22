package com.markle.learning;

public class ShowTime {

	public static void main(String[] args) {
		// Shows Current Time
		long totalTimeInMilliseconds = System.currentTimeMillis();

		// Total secs since Jan 1, 1970
		long totalSeconds = totalTimeInMilliseconds / 1000L;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;

		System.out.println("Current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
		;

	}

}
