import java.util.Scanner;
import java.util.Random;

public class guessNum{
	public static void main(String[] args){
		int guess;
		//Setting up scanner
		Scanner in = new Scanner(System.in);
		
		//UI elements
		System.out.println("I'm thinking of a number between 1 and 100, inclusive." + "\n" + "Can you guess what it is?");
		System.out.print("Type a number: ");
		guess = in.nextInt();
		System.out.println("Your guess is: " + guess);
		
		//Acquiring the target integer
		Random random = new Random();
		int target = random.nextInt(100) + 1;
		System.out.println("The number I was thinking of is: " + target);
		System.out.println("You were off by: " + Math.abs(target - guess));
		
	}
}