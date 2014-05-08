import java.util.Stack;

class Solution {
    public int solution(String S) {
        
        Stack<Character> st = new Stack<Character>();
        
        for(int i = 0; i < S.length(); i++) {
            Character a = S.charAt(i);
            
            if(a.equals('(')) {
                st.push(a);
            }
            else {
                if(st.isEmpty()) return 0;
                st.pop();
            }
        }
        return st.isEmpty() ? 1 : 0;
    }
}
