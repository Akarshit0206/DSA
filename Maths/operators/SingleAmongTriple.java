// => This will also work if the elements are repeating (odd) times  i.e. 5, 7, 9, ...  instead of 3

// There are better approaches then this one { came up with this one.}
class SingleAmongTriple {
  public static int findNumber(int[] arr) {
    int sum = 0;
    for (int ele : arr) {
      String bin = Integer.toBinaryString(ele);
      sum += Integer.parseInt(bin);
    }
    StringBuilder st = new StringBuilder();
    while (sum > 0) {
      int mod = sum % 10;
      st.insert(0, mod % 3); // Here 3 should be replaced with the number of times other elements are
                             // repeating.
      sum /= 10;
    }
    String binString = st.toString();
    return Integer.parseInt(binString, 2);
  }

  public static void main(String[] args) {
    int[] arr = { 7, 7, 7, 14 }; // all elements are repeating 3 times exepet one i.e. 3;
    System.out.println(findNumber(arr));
  }
}
