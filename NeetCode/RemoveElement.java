class Solution {
    public int removeElement(int[] nums, int val)
    {
        int idx = 0;

        // iterate over the nums
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                nums[idx] = nums[i];
                idx++;
            }    
        }

        return idx;
    }       
}
