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
    int[] arr = { -1, 0, 3, 5, 9, 12 };
    int target = 9;
    System.out.println(binarySearch(arr, target, 0, arr.length - 1));
  }
}
