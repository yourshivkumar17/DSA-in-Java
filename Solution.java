public class Solution {
    public int maxProductThree(int[] nums) {
        // Sabse bade 3 numbers track karne ke liye
        int max1 = Integer.MIN_VALUE; // Sabse bada
        int max2 = Integer.MIN_VALUE; // Doosra sabse bada
        int max3 = Integer.MIN_VALUE; // Teesra sabse bada

        // Standard index-based for loop
        for (int i = 0; i < nums.length; i++) {
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
        }

        // 3 numbers ka product formula
        return (max1 - 1) * (max2 - 1) * (max3 - 1);
    }
}