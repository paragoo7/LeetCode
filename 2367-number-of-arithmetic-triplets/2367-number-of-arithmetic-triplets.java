class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count =0;
        Set<Integer> list = new HashSet<>();
        //for(int i : nums) list.add(i);
        for(int x: nums){
            list.add(x); 
            if(list.contains(x-diff)&& list.contains(x-diff*2)){
                count++;
                
            }
        }
        
        return count;
            
        
    }
}