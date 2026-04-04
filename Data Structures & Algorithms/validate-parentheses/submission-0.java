class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '{' || c== '[' || c== '('){
                 st.push(c);
            }else if( c== '}' || c==']' || c== ')'){
                if(st.peek() != c){
                     st.pop();
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
