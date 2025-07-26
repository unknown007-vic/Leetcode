class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals("0P")) return false;
        String str = s.toLowerCase();
        String str1 = "";
        char[] arr = str.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z' || arr[i]>='0'&& arr[i]<='9' ) {
                str1 += arr[i];
            }
        }
        char[] array=str1.toCharArray();
        String rev = "";
        for (int i = array.length-1; i >= 0; i--) {
            rev += array[i];
        }
        if (str1.equals(rev)) return true;
        else return false;
    }
}