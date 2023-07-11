class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int n=nums.length;
        int rightSum=0;
        int leftSum=0;
        
        for(int i=0;i<n;i++){
            
        rightSum+=nums[i];
        
        }
        for(int i=0;i<n;i++){
            leftSum+=nums[i];
            rightSum-=nums[i];
            nums[i]= Math.abs((leftSum-nums[i])-rightSum);
        }
        return nums;
    }
}