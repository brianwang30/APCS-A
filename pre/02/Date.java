public class Date{
	public static void main(String[] args){
		String day = "Friday";
		int date = 27;
		String month = "August";
		int year = 2021;
		
		//print test of each variable
		System.out.println(day);
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		
		//American format: day, month date, year
		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		
		//European format: day date month year
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + " " + year);
	}
	
}