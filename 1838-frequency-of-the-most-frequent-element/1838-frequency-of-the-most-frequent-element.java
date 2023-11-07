class Solution {
        public int maxFrequency(int[] arr, int k) {
        int res = 1, i = 0, j;
        long sum = 0;
        Arrays.sort(arr);
        for (j = 0; j < arr.length; ++j) {
            sum += arr[j];
            while (sum + k < (long)arr[j] * (j - i + 1)) {
                sum -= arr[i];
                i += 1;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}