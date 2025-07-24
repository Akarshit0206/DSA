class Factorial {
  public static int factorial(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("Input should be positive");
    }
    if (n <= 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(factorial(6));
  }
}
