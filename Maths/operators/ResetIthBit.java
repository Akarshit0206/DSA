// Its similar to FindIthBit But insted in this we have to make the i th bit 0; 
// We can use AND gate to solve this. & perform and operation with 0 on the ith bit rest all with 1.

class SetIthBit {
  public static int ithBit(int n, int i) {
    int mask = ~(1 << i - 1);
    n = n & mask;
    return n;
  }

  public static void main(String[] args) {
    int n = 0b100101;
    int i = 3;
    System.out.println("Origingal:" + Integer.toBinaryString(n));
    System.out.println("Converted:" + Integer.toBinaryString(ithBit(n, i)));
  }
}
