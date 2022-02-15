public int triangle(int rows) {
  if(rows > 0){
    return rows + triangle(rows - 1);
  }
  return 0;
}

public static void main(String[] args){
    System.out.println(countX("0") + " → 0");
    System.out.println(countX("1") + " → 1");
    System.out.println(countX("2") + " → 3");
  }

//We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.

//Not tree recursion
//Only one line of calls and returns
//A straight list of calls and return values down a growing triangle
