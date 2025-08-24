//Even Odd can be found out as in binary representation 2^0 decides whether the number is even or odd
//as it's the only odd value in the series i.e. (1) so if the LSB is 0 then the number is Even else it's Odd
//We can Find that out by performing & (AND) operation with that number with 1 on(LSB) rest with 0
// as & operation with 0 returns 0
// & operation with 1 return the other bit
// So if after performin & operation with 1 on LSB if it's 1 then the number is Odd else It's Even.

class EvenOdd {
  public static boolean isEven(int n) {
    if ((n & 1) == 0) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(isEven(2));
  }
}
