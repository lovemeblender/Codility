class Solution {
    public int solution(int X, int[] A) {
        
        boolean[] B = new boolean[X];
        int howMany = 0;
        for(int i = 0; i < A.length; i++) {
            
            if(B[ A[i] - 1 ] == false && A[i] <= X) {
                B[ A[i] - 1 ] = true;
                howMany++;            
                // Inserted all elements (leafs)
                if(howMany == X) {
                    return i;
                }
            }
        }
        return -1;
    }
}
