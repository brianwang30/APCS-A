public boolean catDog(String str) {
  int catCounter = 0;
  int dogCounter = 0;
  for (int i = 0 ; i < str.length() - 2 ; i += 1){
    if (str.substring(i, i + 3).equals("cat")){
      catCounter += 1;
    }
    if (str.substring(i, i + 3).equals("dog")){
      dogCounter += 1;
    }
  }
  return catCounter == dogCounter;
}
