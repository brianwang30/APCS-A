public int sumDigits(int n) {
  if(n > 0){
    return (n%10) + sumDigits(n/10);
  }
  return 0;
}

//Not tree recursion
//Only one line of calls and returns
//A straight list of calls and return values

//Alternatively could be traced as a one depth tree but that just sounds like a single line
