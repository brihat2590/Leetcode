class Solution {
    public int removePalindromeSub(String s) {
        if (s.isEmpty()) return 0; // Edge case: empty string
        if (isPalindrome(s)) return 1; 
        return 2;
        
    }
    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}