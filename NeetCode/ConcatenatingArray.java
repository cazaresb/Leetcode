
public class ConcatenatingArray {
    public int[] concatArray(int[] nums){
        int[] ans = new int[nums.length * 2];
        
        int i = 0;
        for(Integer elem : nums){
            ans[i] = elem;
            ans[i + nums.length] = elem;
            i++;
        }

        return ans;
    }
}
