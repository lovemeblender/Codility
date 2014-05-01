class Solution {
    public int[] solution(int N, int[] A) {
        int[] B = new int[N];
        int lMax = 0, max = 0;
        
        for(int i = 0; i < A.length; i++) {
            
            if(A[i] > N) {
                lMax = max;
            }
            else {
                if(B[A[i] - 1] < lMax) {
                    B[A[i] - 1] = lMax + 1;
                }
                
                int newMax = ++B[A[i] - 1];
                if(newMax > max) {
                    max = newMax;
                }
                
            }
        }
        
        for(int j = 0; j < N; j++) {
            if(B[j] < lMax) {
                B[j] = lMax;
            }
        }
        
        return B;
    }
}
