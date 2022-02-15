//Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
public class countHi{
  public int countHi(String str) {
    if(str.length() > 1){
      if(str.substring(0, 2).equals("hi") == true){
        return 1 + countHi(str.substring(1));
      }
      else{
        return countHi(str.substring(1));
      }
    }
    return 0;
  }
  public static void main(String[] args){
    System.out.println(countHi("xxhixx") + " → 1");
    System.out.println(countHi("xhixhix") + " → 2");
    System.out.println(countHi("hi") + " → 1");
  }
  //Not tree recursion
  //Identical to countX in nature, except for the search zone being 2 at a time
  //^^^^
}
