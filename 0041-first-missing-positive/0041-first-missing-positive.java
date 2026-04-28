class Solution {
    public int firstMissingPositive(int[] nums) {
        java.util.Arrays.sort(nums);

        int expected = 1;  

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == expected) {
                expected++;
            }
        }

        return expected;
    }
}