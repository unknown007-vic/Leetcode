class Solution {
    public String mergeAlternately(String str, String str1 ) {
        if(str.length()==1 && str1.length()==1) return str+str1;
        int max=Math.max(str.length() , str1.length());
        char[] arr=str.toCharArray();
        char[] arr1=str1.toCharArray();
        String result="";
        int st=0;
        int end=0;
        if(max == arr.length){
            while(end<arr1.length){
                result+=arr[st];
                result+=arr1[end];
                st++;
                end++;
            }
            for(int i=st;i<arr.length;i++){
                result+=arr[i];
            }
       }
        else if(max == arr1.length){
            while(st<arr.length){
                result+=arr[st];
                result+=arr1[end];
                st++;
                end++;
            }
            for(int i=end;i<arr1.length;i++){
                result+=arr1[i];
            }
       }
        return result;
    }
}