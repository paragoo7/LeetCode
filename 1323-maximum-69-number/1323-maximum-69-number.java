class Solution {
    public int maximum69Number (int num) {
       char[] result= Integer.toString(num).toCharArray();
        for(int i=0 ; i<result.length; i++){
            if(result[i]=='6'){
                result[i]='9';
                break;
            }
        }
        
      return Integer.valueOf(new String(result)) ; 
    }
}