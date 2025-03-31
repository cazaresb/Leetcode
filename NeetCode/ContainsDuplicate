class ContainsDuplicate{
    public boolean hasDuplicate(int[] nums){
        HashMap<Integer, Boolean> checked = new HashMap<Integer, Boolean>();
        
        for(int i = 0; i < nums.length; i++){
            if(checked.get(nums[i]) == null){
                checked.put(nums[i], true);
            } else {
                return true;
            }
        }
        return false;
    }
}