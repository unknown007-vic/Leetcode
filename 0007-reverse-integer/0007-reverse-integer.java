class Solution {
    public int reverse(int x) {
        double result=0;
        int count=0;       
        while(x!=0){
            int res=x % 10;
            result*=10;
            result+=res;
            x/=10;
            count++;
        }
        if(count>=10 &&(result>Math.pow(2,31) || result<Math.pow(-2,31) ) ) return 0;
        return (int)result;
    }
}