class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> ss= new Stack<>(); 
        StringBuilder sb = new StringBuilder(""); 
        for(int i=0 ; i<s.length();i++){
            if(s.charAt(i)=='('){
                if(ss.size()>0){
                sb.append(s.charAt(i));
                }
                ss.push(s.charAt(i));
            }else{
                ss.pop();
                if(ss.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        
        return sb.toString();
    }
}