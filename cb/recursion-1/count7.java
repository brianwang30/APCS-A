public int count7(int n) {
  if(n > 0){
    if(n%10 == 7){
      return 1+count7(n/10);
    }
    else{
      return count7(n/10);
    }
  }
  return 0;
}

//not tree recursion
//single line of calls and returns
//number shrinking smaller and smaller as the trace progresses
