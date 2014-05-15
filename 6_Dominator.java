import java.util.Stack;

class Solution {
    public int solution(int[] A) {
        
        Stack<Integer> stack = new Stack<Integer>();
        
        int count = 0, index = -1;
        
        for(int i = 0; i < A.length; i++) {
            if(!stack.isEmpty() && A[i] != stack.peek()) {
                stack.pop();
            }
            else {
                stack.push(A[i]);
            }
        }
        
        for(int i = 0; i < A.length; i++) {
            if(!stack.isEmpty() && A[i] == stack.peek()) {
                count++;
                index = i;
            }
        }
        
        return count > (A.length / 2) ? index : -1;
    }
}
