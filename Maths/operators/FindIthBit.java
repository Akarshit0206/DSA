//In this question we have to find the Ith bit of the given number
//e.g. 1001001 => 5th bit= 0;

// We can solve this with the same comcept that we used to solve the Even-Odd question.
// Here we will perform & operation with Ith bith as 1 rest all 0
// We can create a mask for that to perform operation by generating the number with i-1 zeros.

class FindIthBit {
  public static int ithBit(int n, int i) {
    int mask = 1 << i - 1;
    if ((n & mask) == 0)
      return 0;
    return 1;
  }

  public static void main(String[] args) {
    int n = 0b100101;
    int i = 3;
    System.out.println(ithBit(n, i));
  }
}
