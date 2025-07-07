// In this question we have to return the greatest no. from the array which is
// smaller than or equal to the target.

class FloorOfTarget {
  public static int findFloor(int[] arr, int target) {
    int low = 0;
    int high = arr.length;
    int lowestEle = arr[low];
    if (target < lowestEle) {
      System.out.println("No Such Element Present in Array !!!");
      return -999;
    }
    while (low < high) {
      int mid = low + (high - low) / 2;
      int val = arr[mid];
      if (val == target)
        return val;
      if (val < target)
        low = mid + 1;
      else
        high = mid;
    }
    return arr[low - 1];
  }

  public static void main(String[] args) {
    int ans = findFloor(new int[] { 3, 6, 8, 10, 15 }, 1);
    System.out.println(ans);
  }

}
