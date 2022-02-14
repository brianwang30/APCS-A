public int count8(int n) {

  if(n > 0){
    if(n%10 == 8){
      if(n/10%10==8){
        return 2+count8(n/10);
      }
      return 1+count8(n/10);
    }
    else{
      return count8(n/10);
    }
  }
  return 0;
}

//Not tree recursion
//line of calls, only variation is one line of ifs
//Number cut by units place each time, also checking for doubles
