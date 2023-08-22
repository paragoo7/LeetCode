class Solution {
    public long maximumSubarraySum(int[] nums, int k){
        long maxSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0 , i = 0;
        long currSum = 0;
        
        while( j < nums.length){
            map.put(nums[j] , map.getOrDefault(nums[j], 0) + 1); 
            currSum += nums[j];         
            if(j - i + 1 == k){         //3 pair check
                if(map.size() == k){
                    maxSum = Math.max(currSum , maxSum);        
                }
                currSum -= nums[i];         
                map.put(nums[i], map.get(nums[i])-1);                  
				if (map.get(nums[i]) == 0) map.remove(nums[i]);  
				i++;
            }
            j++;
        }
        
        
        return maxSum;
    }
}