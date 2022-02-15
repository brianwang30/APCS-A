public int sumDigits(int n) {
  if(n > 0){
    return (n%10) + sumDigits(n/10);
  }
  return 0;
}

  public static void main(String[] args){
    System.out.println(countX(126") + " → 9");
    System.out.println(countX("49") + " → 13");
    System.out.println(countX("12") + " → 3");
  }

//Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

//Not tree recursion
//Only one line of calls and returns
//A straight list of calls and return values

//Alternatively could be traced as a one depth tree but that just sounds like a single line
