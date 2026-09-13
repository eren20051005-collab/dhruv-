class Solution {
    public int longestSubarray(int[] nums) {

        int left = 0;
        int zero = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zero++;
            }

            while (zero > 1) {
                if (nums[left] == 0) {
                    zero--;
                }
                left++;
            }

            int length = right - left;

            if (length > max) {
                max = length;
            }
        }

        return max;
    }
}