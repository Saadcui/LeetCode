class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        int[] result = new int[1001];
        int count = 0;

        for (int num : nums1) {
            seen[num] = true;
        }

        for (int num : nums2) {
            if (seen[num]) {
                result[count++] = num;
                seen[num] = false;
            }
        }

        return java.util.Arrays.copyOf(result, count);
    }
}