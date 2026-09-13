class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] last = new int[128];

        for (int i = 0; i < 128; i++) {
            last[i] = -1;
        }

        int start = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (last[ch] >= start) {
                start = last[ch] + 1;
            }

            last[ch] = i;

            int length = i - start + 1;

            if (length > max) {
                max = length;
            }
        }

        return max;
    }
}
