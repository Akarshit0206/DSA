//Question: In the question we have given an array of sorted true and false value 
//and the array represents the floor no. with false means that the ball will not break if dropped from there
//and will start to break after the first true appears.
//So we have two TwoCrystalBalls and we have to find the optimum floor for the ball to break 
//so either we can do it with liner time 
//but it can be optimised.

class TwoCrystalBalls {
  public int findBreakPoint(boolean[] arr) {
    int jmpAmount = (int) Math.sqrt(arr.length);
    int i = jmpAmount;

    for (; i < arr.length; i += jmpAmount) {
      if (arr[i])
        break;
    }

    i = i - jmpAmount;

    for (int j = 0; j < jmpAmount && i < arr.length; ++j, ++i) {
      if (arr[i])
        return i;
    }
    return -1;
  }
}
