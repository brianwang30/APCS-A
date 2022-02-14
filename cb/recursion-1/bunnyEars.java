public int bunnyEars(int bunnies) {
  if(bunnies > 0){
    return 2 + bunnyEars(bunnies - 1);
  }
  return 0;
}

//Not tree recursion
//Only one line of calls and returns
//A straight list of calls and return values of bunnies and ears
