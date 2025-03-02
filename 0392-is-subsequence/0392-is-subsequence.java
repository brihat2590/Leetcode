class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                j++; // Move subsequence pointer when characters match
            }
            i++; // Always move main string pointer
        }

        return j == s.length(); 
    }}  