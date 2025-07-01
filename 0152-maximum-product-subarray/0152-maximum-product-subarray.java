class Solution {
    public int maxProduct(int[] num) {
        int max=num[0];
        for(int i=0;i<num.length;i++){
            int pro=1;
            for(int j=i;j<num.length;j++){
                pro*=num[j];
                max=(int) Math.max(max,pro);
            }
        }
        return max;
    }
}