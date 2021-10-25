/*
Team BLt: Brian Wang, Lior Polischouk, Dolphin, Toothless
APCS Pd.6
HW23 -- What Does Equality Look Like? / Creating Coin.java with Driver.java / Making a functional coinflip code
2021-10-22

DISCO:
0. Bias is set to 0 by default because the default unassigned value is 0, making it a very unfair coin.
1. We have to set either heads or tails as a default value for upFace, or else the face will just be "null" for the f>
2. Math.random() is very annoying
QCC:
0. What if the random value equals the bias? Does the coin land on the side?

 */

public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin
    

    //test default constructor
    /*===================TOP==========================*/
      
     Coin mine = new Coin();
      //test 1st overloaded constructor

      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      //System.out.println(yours.getBias());
      //System.out.println(wayne.getBias());
      /*====================BOTTOM======================*/

  }//end main()

}//end class
