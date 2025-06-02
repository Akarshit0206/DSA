class TwoCrystalBalls{
  public int findBreakPoint(boolean[] arr){
    int jmpAmount= (int) Math.sqrt(arr.length);
    int i=jmpAmount;

    for(; i<arr.length; i+=jmpAmount){
      if(arr[i]) break;
    }

    i= i-jmpAmount;

    for(int j=0; j<jmpAmount && i<arr.length; ++j,++i){
      if(arr[i]) return i;
    }
    return -1;
  }
}
