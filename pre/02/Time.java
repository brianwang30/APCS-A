public class Time{
	public static void main(String[] args){
		int hour = 19;
		int minute = 2;
		int second = 13;
		
		//Computing time since midnight
		int secondsSinceMidnight = (hour * 60 + minute) * 60 + second;
		System.out.println("It has been " + secondsSinceMidnight + " since midnight.");
		
		//Computing time from midnight
		int hourFromMidnight = 23 - hour;
		int minuteFromMidnight = 59 - minute;
		int secondFromMidnight = 60 - second;
		System.out.print("The time from midnight is ");
		System.out.println(hourFromMidnight + " hours, " + minuteFromMidnight + " minutes, " + secondFromMidnight + " seconds.");
		int totalSecondsFromMid = (hourFromMidnight * 60 + minuteFromMidnight) * 60 + secondFromMidnight;
		System.out.println("That is " + totalSecondsFromMid + " seconds away from midnight!");
		
		//Computing percentage of the day gone
		Float dayPercent = (float) secondsSinceMidnight / (24 * 60 * 60) * 100;
		System.out.println(dayPercent + "% of the day is over.");
		
		//Time since started
		hour = 19;
		minute = 31;
		second = 44;
		int elapsedSeconds = (hour * 60 + minute) * 60 + second - secondsSinceMidnight;
		System.out.println("It has been " + elapsedSeconds + " seconds since I started this assignment.");
	}
}