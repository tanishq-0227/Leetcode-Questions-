class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int max = nums[0];
        int currMax = nums[0];

        int min = nums[0];
        int currMin = nums[0];

        total = nums[0];

        for (int i = 1; i < nums.length; i++) {
            total += nums[i];

            int v1 = nums[i];
            int v2 = nums[i] + currMax;
            currMax = Math.max(v1, v2);
            max = Math.max(max, currMax);

            int v3 = nums[i];
            int v4 = nums[i] + currMin;
            currMin = Math.min(v3, v4);
            min = Math.min(min, currMin);
        }

        if (max < 0) {
            return max;
        }

        int ans = total - min;

        return Math.max(max, ans);
    }
}