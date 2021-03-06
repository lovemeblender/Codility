// Inspired by http://rafal.io/posts/codility-genomic-range-query.html

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        
        int N = S.length();
        int M = P.length;
        
        int[][] pref = new int[N][4];
        int[] result = new int[M];
        
        for(int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if(c == 'A') pref[i][0] = 1;
            if(c == 'C') pref[i][1] = 1;
            if(c == 'G') pref[i][2] = 1;
            if(c == 'T') pref[i][3] = 1;
        }
        
        // sum prefixes O(N) time  O(N) space
        for(int j = 0; j < 4; j++) {
            for(int i = 0; i < N-1; i++) {
                pref[i + 1][j] += pref[i][j];
            }
        }
        
        // each query
        for(int j = 0; j < M; j++) {
            int from = P[j];
            int to = Q[j];
            // each nucleotide
            for(int i = 0; i < 4; i++) {
                int sub = 0;
                
                if(from - 1 >= 0) { 
                    sub = pref[from - 1][i];
                }
                if(pref[to][i] - sub != 0) {
                    result[j] = i + 1;
                    break;
                }
            }
        }
        return result;
    }
}
