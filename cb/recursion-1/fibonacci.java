public int fibonacci(int n) {
  if(n > 2){
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
  else if(n < 1){
    return 0;
  }
  else{
    return 1;
  }
}

//Not tree recursion
//Only one line of calls and returns
//A straight list of calls and return values of fibo numbers
