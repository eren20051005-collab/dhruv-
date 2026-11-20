class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int len = stack.length();
            
            // Check if the last added char and current char are the same letter with opposite cases
            if (len > 0 && Math.abs(stack.charAt(len - 1) - c) == 32) {
                stack.deleteCharAt(len - 1); // Remove the matching pair
            } else {
                stack.append(c); // Keep the character
            }
        }
        
        return stack.toString();
    }
}