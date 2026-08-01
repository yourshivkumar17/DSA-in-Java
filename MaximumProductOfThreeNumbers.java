public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        // Sabse bade 3 numbers
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        // Sabse chhote 2 numbers (Negative numbers handle karne ke liye)
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // Max 3 update logic
            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] > max3) {
                max3 = nums[i];
            }

            // Min 2 update logic
            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }

        // Maximum of (Top 3 Positives) vs (2 Negatives * 1 Top Positive)
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}