/*
Team BLt: Brian Wang, Lior Polischouk, Dolphin, Toothless
APCS Pd.6
HW23 -- What Does Equality Look Like? / Creating Coin.java with Driver.java / Making a functional coinflip code
2021-10-22

DISCO:
0. Bias is set to 0 by default because the default unassigned value is 0, making it a very unfair coin.
1. We have to set either heads or tails as a default value for upFace, or else the face will just be "null" for the first 2 constructors.
2. Math.random() is very annoying
QCC:
0. What if the random value equals the bias? Does the coin land on the side? 

 */
public class Coin {

  //attributes aka instance vars
  private double value;
  private String upFace = "heads";
  private String name;
  private int flipCtr;
  private int headsCtr;
  private int tailsCtr;
  private double bias = 0.5;


  /***
   *  Coin() -- default constuctor
   *  precond: 
   *  postcond: 
   ***/
  public Coin() {

  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
    name = s;
    if (s == "penny"){
      value = 0.01;
    }
    else if (s == "nickel"){
      value = 0.05;
    }
    else if (s == "dime"){
      value = 0.10;
    }
    else if (s == "quarter"){
      value = 0.25;
    }
    else if (s == "half dollar"){
      value = 0.50;
    }
    else if (s == "dollar"){
      value = 1.00;
    }
    else {
      System.out.println("input a valid coin");
    }
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    name = s;
    if (s == "penny"){
      value = 0.01;
    }
    else if (s == "nickel"){
      value = 0.05;
    }
    else if (s == "dime"){
      value = 0.10;
    }
    else if (s == "quarter"){
      value = 0.25;
    }
    else if (s == "half dollar"){
      value = 0.50;
    }
    else if (s == "dollar"){
      value = 1.00;
    }
    else {
      System.out.println("input a valid coin");
    }
    upFace = nowFace;
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }

  public int getTailsCtr() {
    return tailsCtr;
  }
  public double getBias()  {
    return bias;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
    if (s == "penny"){
      value = 0.01;
    }
    else if (s == "nickel"){
      value = 0.05;
    }
    else if (s == "dime"){
      value = 0.10;
    }
    else if (s == "quarter"){
      value = 0.25;
    }
    else if (s == "half dollar"){
      value = 0.50;
    }
    else if (s == "dollar"){
      value = 1.00;
    }
    else {
      System.out.println("input a valid coin");
    }
    return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    upFace = s;
    bias = d;
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    //What if Math.random is equal to bias?
    flipCtr += 1;
    double randomNum = Math.random();
    if (randomNum < bias) {
      upFace = "tails";
      tailsCtr += 1;
    }
    if (randomNum > bias) {
      upFace = "heads";
      headsCtr += 1;
    }
    //System.out.println("bias: " + bias);
    //System.out.println("Rando: " + randomNum);
    return "Coin denomination is: " + name + ", coin is currently on: " + upFace;
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    return other.getUpFace() == upFace;
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    return ("The coin is: " + name + ", the current face is: " + upFace);
  }

}//end class
