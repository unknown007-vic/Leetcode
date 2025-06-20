class Solution {
    public int findMaxConsecutiveOnes(int[] num) {
        int count=0;
        int max=0;
        for (int j : num) {
            if (j == 1) {
                count++;
                max = Math.max(count, max);
            } else if (j==0) count=0;
        }
        return max;
    }
}