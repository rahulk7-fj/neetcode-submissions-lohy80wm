class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<Character>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(st.isEmpty() || c == '{' || c== '[' || c== '('){
                 st.push(c);
            }else if(c== '}' || c==']' || c== ')'){
                if( st.isEmpty() == true ){
                    return false;
                }else if(isMatch(st.peek(), c) == false){
                    return false;
                }else{
                    st.pop();
                }
            }
        }
        if(st.isEmpty() == false ) return false;
        return true;
    }

    public static boolean isMatch(char a, char b){
        if(a == '[' && b ==']'){
            return true;
        }else if(a == '{' && b == '}'){
            return true;
        }else if(a == '(' && b == ')'){
            return true;
        }
        return false;
    }
}
