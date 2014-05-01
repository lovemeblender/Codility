import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int distinct = 0;
        for(int i = 0; i < A.length - 1; i++) {

            if(A[i] == A[i + 1]) {
                continue;
            }
            distinct++;
        }
        if(A.length == 0) {
            return 0;
        }
        else {
            return distinct + 1;
        }
    }
}
