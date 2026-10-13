class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];

        for (int num : nums1) {
            freq[num]++;
        }

        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int count = 0;

        for (int num : nums2) {
            if (freq[num] > 0) {
                result[count++] = num;
                freq[num]--;
            }
        }

        return java.util.Arrays.copyOf(result, count);
    }
}