public int triangle(int rows) {
  if(rows > 0){
    return rows + triangle(rows - 1);
  }
  return 0;
}

//Not tree recursion
//Only one line of calls and returns
//A straight list of calls and return values down a growing triangle
