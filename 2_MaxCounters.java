class Solution {
    public int[] solution(int N, int[] A) {
        int[] B = new int[N];
        int max = 0;
        
        for(int i = 0; i < A.length; i++) {
            
            if(A[i] > N) {
                // increase all to max
                for(int j = 0; j < N; j++) {
                    B[j] = max;
                }
            }
            else {
                max = ++B[A[i] - 1];
            }
            
        }
        return B;
    }
}
