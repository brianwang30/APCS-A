//Dancing Duckies
//Brian
//Lior
//Jomin
//APCS
//HW14 - Overload
//2021-10-07

/*
Disco
Name/concept of overloaded methods
how to implement them
*/

/*
QCC
Still unsure what a header should actually look like
And we didn't really talk about the "minutes" thing that much
 */


//You see, I already had 2 constructors implemented, so I'm not quite sure if I really need to change anything
public class BigSib {


	private String helloMsg;
	//public instance variable

	//def constructor
	public BigSib(){
		helloMsg = "(default message) hello";
	}

	//constructor with msg
	public BigSib(String msg){
		helloMsg = msg;
	}

	//sets hellomsg for a bigsib
	public void setHelloMsg(String message){
		helloMsg = message;
	}

	//Prints a greeting using the hellomsg and the provided name
        public String greet(String name){
		return helloMsg + " " + name;
	}



}
