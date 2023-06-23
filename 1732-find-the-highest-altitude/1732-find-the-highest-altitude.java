class Solution {
  public int largestAltitude(int[] gain) {
    int currentAltitude = 0;
    int sum = currentAltitude;

    for (int altGain : gain) {
      currentAltitude += altGain;
      sum = Math.max(sum, currentAltitude);
    }

    return sum;
  }
}