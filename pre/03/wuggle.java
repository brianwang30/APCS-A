/**
* Wugga Wugs your World
* Honestly, I have no idea what it's supposed to do?
*/
public class wuggle{
	/**
	* Baffles, prints "You wugga ", then Baffles again
	*/
	public static void zoop() {
		baffle();
		System.out.print("You wugga ");
		baffle();
	}

	/**
	* Prints "No, I " before Zooping, then printing "I ", then Baffles
	*/
	public static void main(String[] args) {
		System.out.print("No, I ");
		zoop();
		System.out.print("I ");
		baffle();
	}

	/**
	* Prints "wug", then pings
	*/
	public static void baffle() {
		System.out.print("wug");
		ping();
	}

	/**
	* Prints a .
	*/
	public static void ping() {
		System.out.println("."); // DON'T INVOKE BAFFLE IT WILL END THE WORLD
	}
}
