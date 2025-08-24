class FindRightMostSetBit {

  // - => This is approach one of Bitmask shifting but this can also be solved
  // with negative binary numbers.
  public static int findSetBitPlace(int n) {
    int mask = 1;
    int count = 1;
    while ((n & mask) == 0) {
      count++;
      mask <<= 1;
    }
    return count;
  }

  public static void main(String[] args) {
    int n = 0b10110000;
    System.out.println(findSetBitPlace(n));
  }
}
