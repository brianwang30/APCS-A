//Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
public class changeXY{
  public String changeXY(String str) {
    if(str.length() > 0){
      if(str.substring(0, 1).equals("x") == true){
        return "y" + changeXY(str.substring(1));
      }
      else{
        return str.substring(0, 1) + changeXY(str.substring(1));
      }
    }
    return "";
  }
  public static void main(String[] args) {
    System.out.print(changeXY("codex") + " → \"codey\"");
    System.out.print(changeXY("xxhixx") + " → \"yyhiyy\"");
    System.out.print(changeXY("xhixhix") + " → \"yhiyhiy\"");
  }

  //Not tree recursion
  //Fundamentally the same as the counts
  //^^^
}
