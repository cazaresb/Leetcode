import java.util.*;
public class TwoSum{
    public int[] findTwoSum(int[] nums, int target){
        int[] pair = new int[2];
        HashMap<Integer, Integer> findDifference = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if(findDifference.get(difference) == null){
                findDifference.put(difference, i);
            }
            if(findDifference.get(nums[i]) != null) {
                if(nums[findDifference.get(nums[i])] == difference){
                    pair[0] = findDifference.get(nums[i]);
                    pair[1] = i;
                }
            }
            
            
        }

        return pair;
    }
}