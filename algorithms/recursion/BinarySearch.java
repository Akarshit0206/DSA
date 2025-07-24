class BinarySearch {
  public static int binarySearch(int[] arr, int target, int low, int high) {
    if (low > high) {
      return -1;
    }
    int mid = low + (high - low) / 2;
    if (arr[mid] == target) {
      return mid;
    }
    if (arr[mid] > target) {
      return binarySearch(arr, target, low, mid - 1);
    }
    return binarySearch(arr, target, mid + 1, high);
  }

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5 };
    int target = 6;
    System.out.println(binarySearch(arr, target, 0, arr.length - 1));
  }
}
