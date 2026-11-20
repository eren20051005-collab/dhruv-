
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int n = sb.length();

            if (n > 0 && sb.charAt(n - 1) == s.charAt(i)) {
                sb.deleteCharAt(n - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
