class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int i:nums){
            if(!list.contains(i)) list.add(i);
            else result.add(i);
        }
        int[] arr=new int[result.size()];
        for(int i=0;i<result.size();i++){
            arr[i]=result.get(i);
        }
        return arr;
    }
}