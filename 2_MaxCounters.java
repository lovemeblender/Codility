class Solution {
    public int[] solution(int N, int[] A) {
        int[] B = new int[N];
        int max = 0, lastMax = 0;
    
        for(int i = 0; i < A.length; i++) {
            int a = A[i] - 1;
            
            // max_counter
            if(A[i] > N) {
                lastMax = max;
            }
            else {
                if(B[a] < lastMax) {
                    B[a] = lastMax + 1;
                } 
                // increase(X)
                else {                
                    B[a]++;
                }
                // if a new max occured  
                if(B[a] > max) {
                    max = B[a];
                }
            } 
        }
        
        for(int j = 0; j < B.length; j++) {
            if(B[j] < lastMax) {
               B[j] = lastMax;
            }
        }
        return B;
    }
}
