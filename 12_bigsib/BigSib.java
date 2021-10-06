//Team Name Placeholder
//Brian (Dolphin)
//Weichen (Blueface)
//APCS
//HW12 - BigSibs
//2021-10-05


/*
Disco
Static variables
Lots of error messages
Usage of instance variables
Newfound hatred for Richard
Finding out the cause my code didn't work was because of a troubleshooting addition I made
My partner's name
*/
/*
 QCC 
What is a Kong Fooey?
 */

public class BigSib {


	public static String helloMsg;
	//public instance variable

	//sets helloMst of BigSib to message
	public static void setHelloMsg(String message){
		helloMsg = message;
	}


        public static String greet(String name){ 
		//return helloMsg + " " + name + "\nSalutations Dr. Spaceman\nHey ya Kong Fooey\nSup mom";
        	//not sure if this is how this is how you want it?
		return helloMsg + " " + name;
		//Should be clarified that we should have created more bigsibs to make 4 greetings in the homework
		//a small mention of changing Greet would be nice
	}



}
