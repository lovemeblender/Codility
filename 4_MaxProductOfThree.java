import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        
        Arrays.sort(A);
        int N = A.length - 1;
        
        int a = A[0] * A[1] * A[N];
        int b = A[N - 2] * A[N - 1] * A[N];
        
        return Math.max(a, b);
    }
}
