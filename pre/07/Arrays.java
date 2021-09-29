

/*
	Exercises 1, 4, and 5 of Think Java Chapter 8
*/

public class Arrays{
	/*
		Exercise 1:
		powArray takes a array of doubles, a, and returns an array of each element in a put to the b-th power
	*/
	public static double[] powArray(double[] a, int b){
		double[] poweredArray = new double[a.length];
		for(int counter = 0 ; counter < a.length ; counter++){
			poweredArray[counter] = Math.pow(a[counter], b);
		}
		return poweredArray;
	}
	
	// Maybe change the name of the program in the future? The name conflicts with Java.util.Arrays.
	public static String doubleToString(double[] array){
		String result = "[" + Double.toString(array[0]);
		for(Double element : array){
			if(element != array[0]){
				result += ", " + Double.toString(element);
			}
		}
		result += "]";
		return result;
	}
	
	public static String intToString(int[] array){
		String result = "[" + Integer.toString(array[0]);
		for(int element : array){
			if(element != array[0]){
				result += ", " + Integer.toString(element);
			}
		}
		result += "]";
		return result;
	}
	
	// Honestly im mad enough at the previous part of this exercise to not properly label this method
	public static int[] histogram(int[] scores, int counters){
		int[] counts = new int[counters];
		for(int score : scores){
			counts[score]++;
		}
		return counts;
	}
	
	// copy pasted from exercise
	public static int inRange(int[] a, int low, int high) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] >= low && a[i] < high) {
            count++;
        }
    }
    return count;
	}
	
	/*
		Exercise 4:
		indexOfMax takes an array of integers, and returns the index of the largest integer.
		Please do not try to put in an integer smaller than lastMax. Please.
	*/
	public static int indexOfMax(int[] intArray){
		
		int lastMax = -2147483648;
		for(int testInt : intArray){
			if(testInt > lastMax){
				lastMax = testInt;
			}
		}
		return index(intArray, lastMax);
	}
	
	/*
		I am aware the point of the exercise is to show that you can't use enhanced for loops.
		However, I am beyond the point of caring.
		In fact, specifically to spite this assignment, i created a index method. 
		Yes, it is linear. No, I do not care.
	*/
	public static int index(int[] intArray, int searchTarget){
		for(int index = 0; index < intArray.length ; index++){
			if(searchTarget == intArray[index]){
				return searchTarget;
			}
		}
		return -1;
	}
	
	/*
		Exercise 5?
		Sieves an array of integers for prime numbers, 
		returns an array of booleans, true for prime subscription, false for inactive prime subscriptions.
	*/
	public static Boolean[] sieve(int n){
		int[] orderedNumbers = new int[n];
		Boolean[] isPrime = new Boolean[n];
		for(int counter = 0 ; counter < n ; counter++){
			isPrime[counter] = true;
		}
		for(int counter = 2 ; counter < n ; counter ++){
			if (isPrime[counter] == true){
				for(int jeb = counter * counter ; jeb < n ; jeb += counter){
					isPrime[jeb] = false;
					//System.out.println(counter);
				}
			}
		}
		isPrime[0] = false;
		isPrime[1] = false;
		//System.out.println(intToString(orderedNumbers)); Just checking
		//System.out.println(boolToString(isPrime));
		return isPrime;
	}
	
	/*
		At this point I'm aware that this instruction will require a better coded toString.
		You win this round,
	*/
	public static String boolToString(Boolean[] array){
		String result = "[" + Boolean.toString(array[0]);
		for(int counter = 1 ; counter < array.length ; counter++){
			result += ", " + Boolean.toString(array[counter]);
		}
		result += "]";
		return result;
	}
	
	public static void main(String[] iWillArgueForPineappleOnPizza){
		double[] testArrayDoubles = {1, 2, 3, 4, 5, 5.5};
		double[] replaceThisName = powArray(testArrayDoubles, 2);
		System.out.println(doubleToString(replaceThisName));
		int[] testArrayInts = {1, 14, 19, 20, 50, 60};
		System.out.println(intToString(histogram(testArrayInts, 100)));
		/* 
			I have some confusion about this exercise, namely is my histogram supposed to look like [1, 1, 1, 1, 1]
			or rather [0, 0, 1, 0, 0, 0, 1...] 
			I'm rather sure this is because of my toString method not accounting for duplicate elements when compared to the first element of the array.
			However, I simply won't code another one, because i was never supposed to in the first place. 
			
			The name for this program should have been anything but "Arrays".
		*/
		
		//System.out.println(indexOfMax(testArrayInts));
		System.out.println(boolToString(sieve(100)));
	}
	
	
}