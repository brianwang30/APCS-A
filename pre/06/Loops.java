/**
*	This class contains the solutions to exercises 3, 4, and 5 from chapter 7 of Think Java.
*/
public class Loops{
	/**
	*	Exercise 3:
	*	An iterative method to find powers of a double. 
	*	Input a double x and non-negative integer n, and get x^n.
	*/
	public static double power(double x, int n){
		double result = 1;
		for(int counter = 0; counter < n; counter++){
			result = result * x;
		}
	return result;
	}
	
	/**
	*	Exercise 4:
	*	An iterative method to find factorials. 
	*	Return a non-negative int, recieve the factorial. 
	*/
	public static int factorial(int n){
		if (n == 0){
			return 0;
		}
		else{
			int result = 1;
			for(int counter = 1; counter < n + 1; counter++){
				result = result * counter;
			}
			return result;
		}
	}
	
	/**
	*	Exercise 5:
	*	The entirety of exercise 5 is a text wall. 
	*	I'm just going to figure it out as i go, it seems to have many parts. 
	*	The first bit is finding e^x?
	*	Going to skip to the last part of part 1 and get rid of the other methods within this method
	*/
	public static double myexp(double x, int n){
		double result = 0;
		double curNumer = 1;
		double curDenomer = 1;
		for(int counter = 1; counter < n + 1; counter++){
			result = result + curNumer/curDenomer;
			//System.out.println("RESULT: " + result);
			//System.out.println("curNumer: " + curNumer);
			//System.out.println("curDenomer: " + curDenomer + "\n");
			curNumer = curNumer * x;
			curDenomer = curDenomer * counter;
		}
		return result;
	}
	
	/**
	*	Check?
	*	Checks the accuracy of myexp
	*/
	public static String check(double x){
		// Not too sure if it's easier to just print the values, as it appears getting string out of doubles is harder than it seems.
		String result = String.valueOf(x) + "\t" + String.valueOf(myexp(x, 10)) + "\t" + String.valueOf(Math.exp(x));
		// Print below if needed
		//System.out.print(x + "    " + myexp(x, 15) + "    " + Math.exp(x));
		return result;
	}
	
	public static void main(String[] whyDoYouEvenReadThese){
		System.out.println(power(2.0, 2));
		System.out.println(power(4.3, 5));
		System.out.println(factorial(0));
		System.out.println(factorial(5));
		System.out.println(myexp(3, 10));
		System.out.println(myexp(0, 0));
		System.out.println(check(1));
		for(double counter = 0.1; counter != 1000.0; counter = counter * 10){
			System.out.println(check(counter));
		}
		// Important to note that as x increases, the numerator and denominator to the approximation of e^x cause a double overflow, skewing the results. 
		
		for(double counter = -0.1; counter != -1000.0; counter = counter * 10){
			System.out.println(check(counter));
		}
		// As expected, the accuracy of myexp durastically changes once we hit double overflow. 
		
		/* 
			A possible fix for this would be to decrease the iterations done by myexp when calculating the approximation. 
			However, that would decrease the accuracy of the final result, therefore leading to less accurate results regardless. 
			Not to mention, the numerators and denominators of the approximation increase so fast that a durastic decrease in accuracy
			would have to be made to possibly fit one more multiple of 10.
		*/
	}
	
}