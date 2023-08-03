class Solution {
    public int maxDepth(String s) {
        int max = 0;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='(') stack.push(s.charAt(i));
        
        else if (!stack.isEmpty() && s.charAt(i)==')'){
            max = Math.max(max, stack.size());
            stack.pop();
        }
        }
        
        return max; 
}
}