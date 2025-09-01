//Question Link: https://leetcode.com/problems/flipping-an-image/description/

class Solution {
  public int[] flip(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    return arr;
  }

  public int[] invert(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        arr[i] = 1;
      } else {
        arr[i] = 0;
      }
    }
    return arr;
  }

  public int[][] flipAndInvertImage(int[][] image) {
    for (int i = 0; i < image.length; i++) {
      image[i] = flip(image[i]);
      image[i] = invert(image[i]);
    }
    return image;
  }

}
