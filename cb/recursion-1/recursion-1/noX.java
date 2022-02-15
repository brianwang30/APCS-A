//Given a string, compute recursively a new string where all the 'x' chars have been removed.
public class noX{
  public String noX(String str) {
    if(str.length() > 1){
      if(str.substring(0, 1).equals("x") == true){
        str = str.substring(1);
        return noX(str);
      }
      else{
        return str.substring(0, 1) + noX(str.substring(1));
      }
    }
    return "";
  }

  public static void main(String[] args) {
    System.out.print(noX("xaxb") + " → \"ab");
    System.out.print(noX("abc") + " → \"abc");
    System.out.print(noX("xx") + " → \"");

  }
}
// DOES NOT WORK!!!!
