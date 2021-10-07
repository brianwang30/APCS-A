//TRIO NAME
//Brian
//Lior
//INSERT NAME
//APCS
//HW14 - Overload
//2021-10-07

//Stuff in defcon/Greet

//USES DEFAULT CONSTRUCTOR
public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib ronnie = new BigSib();
    BigSib roy = new BigSib();
    BigSib ray = new BigSib();

    System.out.println(ronnie.greet("Dr. Spaceman"));
    System.out.println(roy.greet("Kong Fooey"));
    System.out.println(ray.greet("mom"));


  } //end main()
} //end Greet
