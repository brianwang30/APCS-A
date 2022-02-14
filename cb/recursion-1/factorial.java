public int factorial(int n) {
  if(n > 0){
    return n * factorial(n - 1);
  }
  return 1;

}

//Not tree recursion
//Only one line of calls and returns
//A straight list of calls and return values of values multed to each other
