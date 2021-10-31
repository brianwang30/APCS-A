public boolean xyBalance(String str) {
  boolean balance = true;
  for(int i = 0 ; i < str.length() ; i++){
    if(str.substring(i, i+1).equals("x")){
      balance = false;
    }
    if(str.substring(i, i+1).equals("y")){
      balance = true;
    }
  }
  return balance;
}
