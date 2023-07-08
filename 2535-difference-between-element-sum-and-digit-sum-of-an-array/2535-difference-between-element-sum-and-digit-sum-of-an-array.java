class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int temp;
        int DigSum = 0;
        for(int i=0;i<n;i++){
            sum =sum+nums[i];
        
        int k= nums[i];
        while(k!=0){
            DigSum+=k%10;
            k=k/10;
        }
            
        
        }
        int res = sum-DigSum;
        
    return res;
    }
}