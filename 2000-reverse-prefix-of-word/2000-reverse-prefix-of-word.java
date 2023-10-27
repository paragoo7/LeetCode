class Solution {
    public String reversePrefix(String word, char ch) 
    {
        StringBuilder s = new StringBuilder();
        int index = word.indexOf(ch);
        s.append(word.substring(0,index+1));
        s.reverse();
        s.append(word.substring(index+1));
        return s.toString();
    }
}