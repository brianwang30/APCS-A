//Dancing Duckies
//Brian
//Lior
//Jomin
//APCS
//HW14 - Overload
//2021-10-07

//Stuff in defcon/Greet
/*
Disco
(with the aid of my brother)
there can be different constructors for an object
the object varies, in this case, with the input
the default constructor will run if there is no argument given
the new constructor will run if given a string
the new constructor will also set the bigsib's helloMsg to that string
*/

/*
QCC
What does an optimal header comment for a method look like?
 */

public class BigSib {


	private String helloMsg;
	//public instance variable

	//def constructor
	public BigSib(){
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
