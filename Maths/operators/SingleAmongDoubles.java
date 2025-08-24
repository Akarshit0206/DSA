//In this question we have to find the element in a array which appears only once rest all the numbers appears twice.
//We can solve this by using the XOR operator property that a^a = 0
//So for a array {a, b, a, c, d, c, b} 
//we will XOR all => a ^ b ^ a ^ c ^ d ^ c ^ b 
// => Since the order does not matter a^a =0, c^c =0, b^b=0 & we will be left with d. which is our answer.

class SingleAmongDoubles {
  public static int findSingle(int[] arr) {
    int xor = arr[0];
    for (int i = 1; i < arr.length; i++) {
      xor = xor ^ arr[i];
    }
    return xor;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 1, 3, 5, 6, 7, 9, 2, 2, 5, 6, 7, 9 };
    System.out.println(findSingle(arr));
  }
}
