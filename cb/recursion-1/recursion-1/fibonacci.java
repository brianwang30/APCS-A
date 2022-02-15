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

  public static void main(String[] args){
    System.out.println(countX("0") + " → 0");
    System.out.println(countX("1") + " → 1");
    System.out.println(countX("2") + " → 1");
  }

//
The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.

//Not tree recursion
//Only one line of calls and returns
//A straight list of calls and return values of fibo numbers
