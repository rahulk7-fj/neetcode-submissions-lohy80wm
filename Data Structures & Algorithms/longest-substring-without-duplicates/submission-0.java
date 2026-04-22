class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int res = 0, L=0;

        for(int R=0; R<s.length(); R++){
            while(charSet.contains(s.charAt(R))){
                charSet.remove(s.charAt(L));
                L++;
            }
            charSet.add(s.charAt(R));
            res = Math.max(res, R-L+1);
        }

        return res;
    }
}
