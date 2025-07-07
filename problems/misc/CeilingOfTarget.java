//In this question we have to return the smallest no. from the array which is greater than or equal to the target.

class CeilingOfTarget {
  public static int findCeiling(int[] arr, int target) {
    int low = 0;
    int high = arr.length;
    if (target > arr[high - 1]) {
      System.out.println("No Such Element present in array !!!");
      return -999;
    }
    while (low < high) {
      int mid = low + (high - low) / 2;
      int val = arr[mid];
      if (target == val)
        return val;
      if (target > val)
        low = mid + 1;
      else
        high = mid;
    }
    return arr[low];
  }
}
