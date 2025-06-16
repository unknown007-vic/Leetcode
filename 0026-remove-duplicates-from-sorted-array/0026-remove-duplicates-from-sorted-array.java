class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:nums){
            if(!arr.contains(i))
                arr.add(i);
        }
        for(int i=0 ;i<arr.size();i++ ){
            nums[i]=arr.get(i);
        }
        return arr.size(); 
    }
}