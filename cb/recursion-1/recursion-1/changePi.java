//Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
public class changePi{
  public String changePi(String str) {
    if(str.length() > 1){
      if(str.substring(0, 2).equals("pi") == true){
        return "3.14" + changePi(str.substring(2));
      }
      else{
        return str.substring(0, 1) + changePi(str.substring(1));
      }
    }
    if(str.length() > 0){
      return str.substring(str.length() - 1);
    }
    return "";
  }
  public static void main(String[] args){
    System.out.print(changePi("xpix") + " → \"x3.14x");
    System.out.print(changePi("pipi") + " → \"3.143.14") ;
    System.out.print(changePi("pip") + " → \"3.14p");
  }

  //Not tail recursion
  //almost identical to changeXY
  //^^^
}
