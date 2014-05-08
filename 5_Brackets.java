import java.util.Stack;

class Solution {
    public int solution(String S) {
        int result;
        Stack<Character> st = new Stack<Character>();
        
        for(int i = 0; i < S.length(); i++) {
            
            Character a = S.charAt(i);
            
            if(a.equals('(') | a.equals('[') | a.equals('{') ) {
                st.push(S.charAt(i));
            }
            else {
                if(st.isEmpty()) return 0;
                Character b = st.pop();
                
                if(a.equals(')') & !b.equals('(')) return 0;
                if(a.equals(']') & !b.equals('[')) return 0;
                if(a.equals('}') & !b.equals('{')) return 0;
            }
        }
    
        return st.isEmpty() ? 1 : 0;
    }
}
