class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int n = mat.size();
        int localSum=0;
      
        // primary diagonal
        for(int i=0, j=0; i<n,j<n; i++,j++ ){
            localSum += mat[i][j];
          //  cout<<mat[i][j]<<" ";
        }
        // secondary diagonal
        for(int i=0,j=n-1; i<n,j>=0; i++,j--){
            localSum += mat[i][j];
       }
        return (n%2 == 0) ? localSum : localSum - mat[n/2][n/2];
    }
};