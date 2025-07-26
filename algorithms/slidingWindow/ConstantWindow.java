//exaple Question to understand Algorithm: Given is an integer array and a integer k,  the task is to find the highest sum with k consecutive elements.

//"This is the basic template which other question of this pattern follow"

class ConstantWindow {
  public static int highestSumOfSubArray(int[] arr, int k) {
    int l = 0;
    int r = k - 1;
    int sum = 0;
    for (int i = 0; i <= r; i++) {
      sum += arr[i];
    }
    int maxSum = sum;
    while (r < arr.length - 1) {
      sum -= arr[l];
      l++;
      r++;
      sum += arr[r];
      maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, -3, 5, 6, -1, 3 };
    int k = 3;
    int res = highestSumOfSubArray(arr, k);
    System.out.println(res);
  }
}
