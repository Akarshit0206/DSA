//Works for arrays with elements in the range 1-N. (N= size of array)

class CyclicSort {
  public static void cyclicSort(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correctIndex = nums[i] - 1;
      if (nums[i] != nums[correctIndex]) {
        int temp = nums[correctIndex];
        nums[correctIndex] = nums[i];
        nums[i] = temp;
      } else {
        i++;
      }
    }
  }
}
