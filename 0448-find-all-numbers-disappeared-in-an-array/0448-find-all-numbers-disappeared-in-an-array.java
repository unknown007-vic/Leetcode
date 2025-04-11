class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[nums.length + 1];
        int n = nums.length;
        for (int i = 0; i < n; i++){
         count[nums[i]] += 1;
        }
        for (int i = 1; i <= n; i++){
            if (count[i] == 0)
               list.add(i);
        }
        return list;
    }
}