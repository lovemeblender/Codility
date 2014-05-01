class Solution {
    public int solution(int[] A) {
        int pCars = 0, zeros = 0, aces = 0;
        
        for(int i = 0; i < A.length; i++) {
            if(A[i] == 0) {
                zeros++;
            }
            
            if(A[i] == 1) {
                pCars = pCars + zeros;
            }
        }
        
        return pCars < 1000000000 ? pCars : -1;
    }
}
