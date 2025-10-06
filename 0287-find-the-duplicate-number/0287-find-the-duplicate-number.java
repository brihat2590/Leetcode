class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Find intersection point
        while (true) {
            slow = nums[slow];          // move 1 step
            fast = nums[nums[fast]];    // move 2 steps

            if (slow == fast) {         // cycle detected
                break;
            }
        }

       //arko phase find cycle
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;  // duplicate number
    }
}
