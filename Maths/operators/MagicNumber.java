// Magic Number is the sum of binary representation bits multiplied by power consistently increasing
// with base 5 
// e.g. for 2 => binary= 10 so=> 5^2 * 1 + 5^1 * 0 => 25.
// for 6 => binary= 110 so-> 5^3 * 1 + 5^2 * 1 + 5^1 * 0 => 125+25+0 => 150.
// We can get the digits wy performing & operation with 1 & left shift 1 by one place on every iteration
// & multiply it with the repective power to 5.

class MagicNumber {
  public static int nThMagicNumber(int n) {
    int res = 0;
    int base = 5;
    while (n > 0) {
      int lastBit = n & 1;
      n >>= 1;
      res += lastBit * base;
      base *= 5;
    }
    return res;
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println(nThMagicNumber(n));
  }
}
