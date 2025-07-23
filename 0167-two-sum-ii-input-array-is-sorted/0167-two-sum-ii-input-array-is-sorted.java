class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int[] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++ ){
                if(nums[i]+nums[j] ==tar){
                    arr[0]=i+1;
                    arr[1]=j+1;
                    return arr;
                }
            }
        }
        return arr;
    }
}