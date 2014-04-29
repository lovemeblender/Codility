import java.util.ArrayList;

class Solution {
    public int solution(int[] A) {
        
        int sum = 0;
        int result;
        long n = A.length*(A.length+1)/2;
        ArrayList<Integer> B = new ArrayList<Integer>();
        
        for(int i = 0; i < A.length; i++) {
            if( B.contains(A[i]-1) ) return 0;
            B.add( A[i]-1 );
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
