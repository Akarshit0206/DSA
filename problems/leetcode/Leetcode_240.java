//Question Link: https://leetcode.com/problems/search-a-2d-matrix-ii/description/

class Solution {

  public boolean binarySearch(int[] arr, int target, int low, int high) {
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target)
        return true;
      if (arr[mid] < target)
        low = mid + 1;
      else
        high = mid - 1;
    }
    return false;
  }

  public boolean searchMatrix(int[][] matrix, int target) {
    int row = 0;
    int col = matrix[0].length - 1;
    while (row < matrix.length) {
      if (binarySearch(matrix[row], target, 0, col))
        return true;
      row++;
    }
    return false;
  }
}
