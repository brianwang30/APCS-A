//Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
public class countX{

  public int countX(String str) {
    if(str.length() > 0){
      if(str.substring(0, 1).equals("x") == true){
        return 1 + countX(str.substring(1));
      }
      else{
        return countX(str.substring(1));
      }
    }
    return 0;
  }

  public static void main(String[] args){
    System.out.println(countX("xxhixx") + " → 4");
    System.out.println(countX("xhixhix") + " → 3");
    System.out.println(countX("hi") + " → 0");
  }

  //not tree recursion
  //only a single path of letters
  //A word with its first letter cut off every time, checking if it is x
}
