//Question Link: https://leetcode.com/problems/integer-to-roman/

import java.util.HashMap;

class Solution {
  int numberOfPlaces(int num) {
    int places = 1;
    int numCopy = num;
    while (numCopy > 0) {
      numCopy /= 10;
      places *= 10;
    }
    return places / 10;
  }

  public String intToRoman(int num) {
    HashMap<Integer, Character> hash = new HashMap<>();
    hash.put(1, 'I');
    hash.put(5, 'V');
    hash.put(10, 'X');
    hash.put(50, 'L');
    hash.put(100, 'C');
    hash.put(500, 'D');
    hash.put(1000, 'M');
    int divisor = 10;
    int numCopy = num;
    StringBuilder st = new StringBuilder();
    while (numCopy > 0) {
      int rem = numCopy % divisor;
      if (rem == 0) {
        divisor *= 10;
        continue;
      }
      if (hash.get(rem) != null) {
        st.insert(0, hash.get(rem));
      } else {
        int places = numberOfPlaces(rem);
        if (hash.get(rem + places) != null) {
          char greater = hash.get(rem + places);
          st.insert(0, greater);
          st.insert(0, hash.get(places));
          numCopy -= rem;
          divisor *= 10;
          continue;
        }
        int placesCount = 0;
        int remCopy = rem;
        while (hash.get(remCopy) == null) {
          remCopy -= places;
          placesCount += 1;
        }
        for (int i = 0; i < placesCount; i++) {
          st.insert(0, hash.get(places));
        }
        st.insert(0, hash.get(remCopy));
      }
      numCopy -= rem;
      divisor *= 10;
    }
    return st.toString();
  }
}
