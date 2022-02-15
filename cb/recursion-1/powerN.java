//Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
public class powerN{
  public int powerN(int base, int n) {
    if(n > 0){
      return base * powerN(base, n-1);
    }
    return 1;
  }
  public static void main(String[] args){
    System.out.println(powerN(3, 1) + " → 3");
    System.out.println(powerN(3, 2) + " → 9");
    System.out.println(powerN(3, 3) + " → 27");
  }

  //Not tree recursion
  //No acutal splitting/brances necessary, straight line
  //increasing numbers by decreasing powers
}
