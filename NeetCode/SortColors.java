class Solution {
    // Red      = 0
    // White    = 1
    // Blue     = 2
    public void sortColors(int[] nums) {
        // Pointers to 3 colors
        int rIdx = 0;
        int wIdx = 1;
        int bIdx = 2;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0) // Red
            {
                nums[rIdx] = nums[i];
                rIdx++;
                wIdx++;
                bIdx++;
            }
            else if (nums[i] == 1) // White
            {
                nums[wIdx] = nums[i]; 
                wIdx++;
                bIdx++;
            }
            else 
            {
                nums[bIdx] = nums[i];
                bIdx++;
            }
        }
    }
}
