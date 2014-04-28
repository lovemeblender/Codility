
class Solution {
    public int solution(int[] A) {
    
    int sum = 0;
    for(int i = 0; i < A.length; i++) {
        sum += A[i];
    }
    
    int res = 0, curSum = 0;
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < A.length - 1; i++) {
        curSum += A[i];
        res = Math.abs(curSum - (sum - curSum));
        if(min > res) {
            min = res;
        }
    }
    return min;
    }
}
