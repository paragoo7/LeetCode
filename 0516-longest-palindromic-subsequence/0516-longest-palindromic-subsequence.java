class Solution {
      public int helper(String s,int[][] matrix,int i, int j) {
        if(i==j)
            return 1;
        if (i>j)
            return 0;
        if(matrix[i][j]!=-1)
            return matrix[i][j];
        if(s.charAt(i)==s.charAt(j)) 
            return matrix[i][j] = helper(s,matrix,i+1,j-1)+2;
        return matrix[i][j] = Math.max(helper(s,matrix,i+1,j),helper(s,matrix,i,j-1));
    }
    public int longestPalindromeSubseq(String s) {
        int size = s.length();
        int[][] mat = new int[size][size];
        for (int[] ints : mat) 
            Arrays.fill(ints, -1);
        return helper(s,mat,0,size-1);
    }
}