class Solution {
    public int maxFrequencyElements(int[] nums) {

        int[] count = new int[101];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int max = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        int ans = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                ans = ans + count[i];
            }
        }

        return ans;
    }
}