class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int st=nums[0];
        int zero=0;
        if(st != zero) return 0;
        for(int i=0;i<nums.length;i++){
            if(st != nums[i])
                return st;
            st++;    
        }
        return st;   
    }
}