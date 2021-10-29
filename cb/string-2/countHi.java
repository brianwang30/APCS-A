public int countHi(String str) {
  int counter = 0;
  for (int i = 0 ; i < str.length() - 1 ; i += 1){
    if (str.substring(i, i + 2).equals("hi")){
      counter += 1;
    }
  }
  return counter;
}
