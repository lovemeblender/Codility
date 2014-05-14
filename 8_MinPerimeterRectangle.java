
class Solution {
    public int solution(int N) {
        
        int a, b, per = 0, minPer = Integer.MAX_VALUE;
        
        for(int i = 1; i < Math.sqrt(N) + 1; i++) {
            if(N % i == 0) {
                a = i;
                b = N / i;
                per = 2 * (a + b);
            }
            minPer = Math.min(minPer, per);
        }
        return N == 1 ? 4 : minPer;
    }
}
