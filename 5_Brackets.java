import java.util.Stack;

class Solution {
    public int solution(String S) {
        int result;
        Stack<Character> st = new Stack<Character>();
        
        // S is empty
        if(S.equals("")) return 1;
        
        for(int i = 0; i < S.length(); i++) {
            st.push(S.charAt(i));
        }
        
        for(int i = 0; i < S.length(); i++) {
            Character a = S.charAt(i);
            Character b = st.pop();
            
            if(a.equals('{') & !b.equals('}')) return 0;
            else if(a.equals('[') & !b.equals(']')) return 0;
            else if(a.equals('(') & !b.equals(')')) return 0;
        }
    
        return 1;
    }
}
