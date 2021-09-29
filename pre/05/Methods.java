/**
*	The class Methods contains all the methods needed to solve exercises 2, 3, and 8,
*	from chapter 6 in Think Java.
*/

public class Methods{
	/**
	*	Exercise 2:
	*	A method that takes 2 integers n and m, and returns a boolean.
	*	Returns true of n is divisible by m.
	*	Returns false otherwise.
	*/
	public static boolean isDivisible(int n, int m){
		return n%m == 0;
	}
	
	/**
	*	Exercise 3:
	*	A method that takes 3 positive integers, sideOne, sideTwo, and sideThree, and returns a boolean.
	*	Returns true if a triangle can be made of the three sides.
	*	Returns false otherwise.
	*/
	public static boolean isTriangle(int sideOne, int sideTwo, int sideThree){
		return ((sideOne + sideTwo) > sideThree) && ((sideOne + sideThree) > sideTwo) && ((sideTwo + sideThree) > sideOne);
	}
	
	/**
	*	Exercise 4:
	*	Calculates Ackermann values. 
	*/
	public static int ack(int m, int n){
		if (m == 0){
			return n+1;
		}
		if (m > 0 && n == 0){
			return ack(m-1, 1);
		}
		else {
			return ack(m-1, ack(m, n-1));
		}
	}
	
	public static void main(String[] myNameIsYoshikageKira){
		System.out.println(isDivisible(4, 2));
		System.out.println(isDivisible(5, 3));
		System.out.println(isTriangle(2, 2, 3));
		System.out.println(isTriangle(1, 2, 11));
		System.out.println(ack(0, 1));
		System.out.println(ack(2, 0));
		System.out.println(ack(3, 3));
	}
}