class numberofrotations {

  public static int findPeak(int[] nums) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (mid + 1 <= high && nums[mid] > nums[mid + 1]) {
        return mid;
      }
      if (mid - 1 >= low && nums[mid] < nums[mid - 1]) {
        return mid - 1;
      }
      if (nums[low] >= nums[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }

  public int findRoatiations(int[] nums) {
    int peak = findPeak(nums);
    if (peak + 1 == nums.length)
      return 0;
    else
      return peak + 1;
  }
}
