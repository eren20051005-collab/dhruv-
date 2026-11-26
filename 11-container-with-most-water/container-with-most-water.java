class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int smallerHeight;

            if (height[left] < height[right]) {
                smallerHeight = height[left];
            } else {
                smallerHeight = height[right];
            }

            int water = width * smallerHeight;

            if (water > maxWater) {
                maxWater = water;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}