//Question Link: https://leetcode.com/problems/search-a-2d-matrix/description/

class Solution {

  public boolean binarySearch(int[] arr, int target, int low, int high) {
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target)
        return true;
      if (arr[mid] > target)
        high = mid - 1;
      else
        low = mid + 1;
    }
    return false;
  }

  public boolean searchMatrix(int[][] matrix, int target) {
    for (int i = 0; i < matrix.length; i++) {
      if (binarySearch(matrix[i], target, 0, matrix[i].length - 1))
        return true;
    }
    return false;
  }
}
