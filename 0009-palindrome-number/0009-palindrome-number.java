class Solution {
    public boolean isPalindrome(int x) {
        int result = 0;
        int check=x;
        boolean flag=true;
        if( x < 0 ) flag=false;
        while(x!=0){
            int res=x%10;
            result*=10;
            result+=res;
            x/=10;
        }
        if(flag == true && check==result) return true ;
        return false;
    }
}