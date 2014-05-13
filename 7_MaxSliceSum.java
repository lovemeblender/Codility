class Solution {
    public int solution(int[] A) {
        int maxSlice = 0, maxEnding = 0;
        int minNeg = Integer.MIN_VALUE;
        boolean hasPos = false;
        
        for(int i = 0; i < A.length; i++) {
            if(A[i] >= 0) {
                hasPos = true;
            }
            maxEnding = Math.max(0, maxEnding + A[i]);
            maxSlice = Math.max(maxSlice, maxEnding);
            if(A[i] < 0) {
              minNeg = Math.max(minNeg, A[i]);
            }
        }
        return hasPos ? maxSlice : minNeg;
    }
}
