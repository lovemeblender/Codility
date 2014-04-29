
class Solution {
    public int solution(int[] A) {
        
        int sum = 0;
        int result;
        long n = A.length*(A.length+1)/2;
        int[] B = new int[A.length + 1];
        
        for(int i = 0; i < A.length; i++) {
            B[A[i]-1]++;
            sum += A[i];
        }
        
        for(int i = 0; i < B.length; i++) {
            if (B[i] > 1) return 0;
        }
        
        if(n - sum == 0) { 
            result = 1;
        }
        else {
            result = 0;
        }
        
        return result;
    }
}
