class Solution {
    public String reversePrefix(String str1, char cha) {
        String result="";
        int ind=-1;
        char[] arr=str1.toCharArray();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == cha){
                ind=i;
                break;
            }
        }
        if (ind==-1) return str1;
        for (int i = ind; i >=0 ; i--) {
            result+=arr[i];
        }
        for (int i = ind+1; i < str1.length() ; i++) {
            result+=arr[i];
        }
        return result;
    }
}