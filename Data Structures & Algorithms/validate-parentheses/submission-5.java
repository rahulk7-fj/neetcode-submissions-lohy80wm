class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
            if(st.isEmpty()==true){
                return false;
            }else if (isMatch((char)st.peek(), ch)== false){
                return false;
            }
            st.pop();
            }
        }
        if(st.isEmpty() == false) return false;
        return true;
    }

    public boolean isMatch(char a , char b){
        if(a == '(' && b == ')'){
            return true;
        }else if (a == '{' && b == '}'){
            return true;
        }else if(a == '[' && b == ']'){
            return true;
        }

        return false;
    }
}
