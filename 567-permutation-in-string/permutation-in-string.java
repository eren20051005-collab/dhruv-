class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int k = s1.length();

        for (int i = 0; i <= s2.length() - k; i++) {

            String sub = s2.substring(i, i + k);

            if (isPermutation(s1, sub)) {
                return true;
            }
        }

        return false;
    }

    public boolean isPermutation(String s1, String sub) {

        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i) - 'a']++;
            b[sub.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}