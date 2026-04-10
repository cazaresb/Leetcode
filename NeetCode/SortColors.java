class Solution {
    // Red      = 0
    // White    = 1
    // Blue     = 2
    public void sortColors(int[] nums) {
        // Pointers to 3 colors
        // Dijkstra's approach
        int lo  = 0;
        int hi  = nums.length - 1;
        int mid = 0;

        while (mid <= hi)
        {
            if (nums[mid] == 0) // red
            {
                // Swap w low
                int tmp     = nums[lo];
                nums[lo]    = nums[mid];
                nums[mid]   = tmp;

                lo++;
                mid++;
            }
            else if (nums[mid] == 1) // white
            {
                mid++;
            }
            else
            {
                // Swap w high
                int tmp = nums[hi];
                nums[hi] = nums[mid];
                nums[mid] = tmp;

                hi--;
            }
        }
    }
}
