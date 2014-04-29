class Solution {
    public int solution(int[] A) {
        
        int sum = 0;
        int n = A.length + 1;
        
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        
        return ((n*(n + 1)) / 2) - sum;
    }
}
