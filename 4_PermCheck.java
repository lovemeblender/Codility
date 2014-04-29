
class Solution {
    public int solution(int[] A) {
        
        int sum = 0;
        int result;
        long n = A.length*(A.length+1)/2;
        
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
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
