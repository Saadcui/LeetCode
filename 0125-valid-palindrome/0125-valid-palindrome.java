class Solution {
  
    public boolean isPalindrome(String s) {
    
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            
     
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            
            // 2. Move the right pointer past non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            if (left < right) {
                char leftChar = Character.toLowerCase(s.charAt(left));
                char rightChar = Character.toLowerCase(s.charAt(right));
                
                // 3. Compare the characters
                if (leftChar != rightChar) {
                    return false; // Not a palindrome
                }
                
                left++;
                right--;
            }
        }
                return true;
    }
}