class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length();i++){
            
            if(!st.isEmpty() && st.peek() == s.charAt(i))
                    st.pop();
                
            else{
                    st.push(s.charAt(i));
                }
        }
        
         while(!st.isEmpty()){
             str.append(st.pop());
         }
        return str.reverse().toString();
    }
}
