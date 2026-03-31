import java.util.Arrays;

class Solution {
  public String longestCommonPrefix(String[] strs) {
    String result = "";

    // Edge case
    if (strs.length == 1) {
      return strs[0];
    }
    // Sort for edge case
    Arrays.sort(strs);

    // Iterate over chars
    for (int i = 0; i < strs[0].length(); i++) {
      char curr = '\0';
      // Iterate over all the words
      for (int j = 0; j + 1 < strs.length; j++) {
        char left = strs[j].charAt(i);
        char right = strs[j + 1].charAt(i);

        if (left != right) {
          return result;
        }

        curr = left;
      }
      if (curr != 0) {
        result = result + curr;
      }
    }

    return result;

  }
}
