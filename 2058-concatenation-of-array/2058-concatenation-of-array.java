class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=new int[nums.length+nums.length];
        int inx=0;
        for(int i : nums){
            res[inx]=i;
            inx++;
        }
        for(int i : nums){
            res[inx]=i;
            inx++;
        }
        return res;
    }
}