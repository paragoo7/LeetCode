class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> ss = new Stack<>();
        Map<Integer , Integer> map = new HashMap<>();
        for(int x : nums2){
            while(!ss.isEmpty()&& ss.peek()< x){
                map.put(ss.pop() , x);
            }
            ss.push(x);
        }
        
        for(int i = 0; i<nums1.length;i++){
            nums1[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1;
        }
        
        return nums1;
        
    }
}