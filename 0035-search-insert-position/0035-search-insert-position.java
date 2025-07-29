class Solution {
    public int searchInsert(int[] nums, int target) {
        int arr[]=new int[nums.length+1];
        int i=0;
        for(i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        arr[i]=target;
        Arrays.sort(arr);
        for(i=0;i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
}