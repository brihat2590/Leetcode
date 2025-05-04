import java.util.*;

public class Solution {
   
    private static final String[] KEYPAD = {
        "",     
        "",     
        "abc",  
        "def",  
        "ghi",  
        "jkl",  
        "mno",  
        "pqrs", 
        "tuv",  
        "wxyz"  
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

       
        if (digits == null || digits.length() == 0) {
            return result;
        }

        
        generateCombinations(digits, 0, "", result);
        return result;
    }

    
    private void generateCombinations(String digits, int index, String current, List<String> result) {
        // Base case: if we've used all digits, add the current combination to result
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        // Get the digit at current index (e.g., '2') and find its letters (e.g., "abc")
        int digit = digits.charAt(index) - '0';
        String letters = KEYPAD[digit];

        //sab ko lai recurse
        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(digits, index + 1, current + letters.charAt(i), result);
        }
    }
}
