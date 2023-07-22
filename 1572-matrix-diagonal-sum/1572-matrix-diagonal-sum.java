class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int localSum = 0;
        for (int i = 0; i < n; i++) {
            localSum += mat[i][i];
        }
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            localSum += mat[i][j];
        }
        return (n % 2 == 0) ? localSum : localSum - mat[n/2][n/2];
    }
}