/* Given an integer array nums and an integer k, return the k most frequent elements within the array. */
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    // Need to sort the array for easy frequency calculate
    Arrays.sort(nums);

    // Keep track of frequencies using Hashmap
    // Key: Frequency, Value: Element
    HashMap<Integer, Deque<Integer>> frequencies = new HashMap<Integer, Deque<Integer>>();

    // Edge cases
    if (nums.length == 0) {
      return new int[0];
    } else if (nums.length == 1) {
      return nums;
    }

    // Iterate and calculate frequencies
    int prev = 0;
    int curr = 1;
    int frequency = 1;
    while (curr < nums.length) {
      if (nums[prev] == nums[curr]) frequency++;
      else {
        Deque<Integer> bucket = frequencies.getOrDefault(frequency, new ArrayDeque<Integer>());
        bucket.push(nums[prev]);

        frequencies.put(frequency, bucket);
        frequency = 1;
      }

      prev++;
      curr++;
    }

    Deque<Integer> bucket = frequencies.getOrDefault(frequency, new ArrayDeque<Integer>());
    bucket.push(nums[prev]);

    frequencies.put(frequency, bucket);

    int[] result = new int[k];

    // Iterate HashMap, find k most frequent elements.
    int i = nums.length;

    while (k >= 1 && i >= 0) {
      if ((bucket = frequencies.get(i)) != null && !bucket.isEmpty()) {
        Integer popped = bucket.pop();

        result[k - 1] = popped;
        k--;

      } else i--;
    }

    return result;
  }
}
