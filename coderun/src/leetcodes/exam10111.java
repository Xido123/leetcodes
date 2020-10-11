package leetcodes;

import java.util.Stack;

public class exam10111 {
    public int maxDepth(String s) {
        int max = 0;
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c =='('){

                st.push(c);
                max = max>st.size()?max:st.size();
            }
            if(!st.isEmpty()&& c == ')'){
                st.pop();
            }
        }
        return max;
    }
}
