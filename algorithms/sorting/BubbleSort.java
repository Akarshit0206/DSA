public class BubbleSort {
  public int[] sort(int[] arr) {
    for (int i = 0; i < arr.length; ++i) {
      boolean isSwapped = false;
      for (int j = 0; j < arr.length - 1 - i; ++j) {
        int temp = arr[j];
        if (arr[j] > arr[j + 1]) {
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          isSwapped = true;
        }
      }
      if (!isSwapped)
        break;
    }
    return arr;
  }
}
