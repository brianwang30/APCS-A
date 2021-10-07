//Giant Rabbits
//Brian (Dolphin)
//WeiChen (Blueface)
//APCS
//HW13 - Hatch
//2021-10-06

//Stuff in BigSib


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
