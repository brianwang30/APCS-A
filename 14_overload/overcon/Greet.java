//TRIO NAME
//Brian
//Lior
//INSERT NAME
//APCS
//HW14 - Overload
//2021-10-07

//Stuff in defcon/Greet

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib("Word Up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib ronnie = new BigSib("Salutations");
    BigSib roy = new BigSib("Hey ya");
    BigSib ray = new BigSib("Sup");

    System.out.println(ronnie.greet("Dr. Spaceman"));
    System.out.println(roy.greet("Kong Fooey"));
    System.out.println(ray.greet("mom"));


  } //end main()
} //end Greet
