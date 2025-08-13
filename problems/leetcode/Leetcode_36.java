//Question Link: https://leetcode.com/problems/valid-sudoku/description/

import java.util.HashMap;
import java.util.HashSet;

class Solution {
  public boolean isValidSudoku(char[][] board) {
    HashMap<Integer, HashSet<Integer>> colHash = new HashMap<>();
    HashSet<Integer> boxSet1 = new HashSet<>();
    HashSet<Integer> boxSet2 = new HashSet<>();
    HashSet<Integer> boxSet3 = new HashSet<>();
    for (int i = 0; i < board.length; i++) {
      HashSet<Integer> rowSet = new HashSet<>();
      for (int j = 0; j < board[i].length; j++) {
        int val = (int) (board[i][j] - 48);
        if (val > 0) {
          if (rowSet.contains(val))
            return false;
          if (j < 3) {
            if (boxSet1.contains(val))
              return false;
            boxSet1.add(val);
          } else if (j < 6) {
            if (boxSet2.contains(val))
              return false;
            boxSet2.add(val);
          } else {
            if (boxSet3.contains(val))
              return false;
            boxSet3.add(val);
          }
          rowSet.add(val);
        }
        if (colHash.get(j) == null) {
          if (val > 0) {
            HashSet<Integer> colSet = new HashSet<>();
            colSet.add(val);
            colHash.put(j, colSet);
          }
        } else {
          if (colHash.get(j).contains(val))
            return false;
          if (val > 0) {
            colHash.get(j).add(val);
          }
        }
      }
      if (i == 2 || i == 5 || i == 8) {
        boxSet1.clear();
        boxSet2.clear();
        boxSet3.clear();
      }
    }
    return true;
  }
}
