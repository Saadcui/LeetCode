
import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long curr = nums[i];

            // Find the smallest number >= curr - valueDiff
            Long candidate = set.ceiling(curr - valueDiff);

            // Check if a number exists within the allowed value range
            if (candidate != null && candidate <= curr + valueDiff) {
                return true;
            }

            set.add(curr);

            // Keep only elements within indexDiff distance
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
    }
}
