

public class FindFirstPalindromeStringInArray {

// Leetcode 2108
  public String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word); 
            String reversed = sb.reverse().toString(); 
            if (word.equals(reversed)) {
                return word; 
            }
        }
        return ""; 
    }
}
