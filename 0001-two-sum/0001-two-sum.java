class Solution {
    public int[] twoSum(int[] nums, int target) {
        int st = 0, end = st + 1;
        int[] arr = new int[2];
        while (st < nums.length-1) {
            end=st+1;
            while (end < nums.length) {
                if (nums[st] + nums[end] == target) {
                    arr[0] = st;
                    arr[1] = end;
                    return arr;
                }
                end++;
            }
            st++;
        }
        return arr;
    }
}