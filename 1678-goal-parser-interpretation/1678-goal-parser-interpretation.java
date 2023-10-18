class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder("");
        int n=command.length();
        for(int i=0;i<n;i++){
            if(command.charAt(i)=='G'){
                sb.append("G");
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sb.append("o");
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                sb.append("al");
            }
        }
        
        return sb.toString();
    }
}