class Solution {
    public int heightChecker(int[] arr) {
        int[] num=new int[arr.length];
        for (int i = 0; i < num.length; i++) {
            num[i]=arr[i];
        }
        Arrays.sort(num);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=num[i]) count++;
        }
        return count;
    }
}