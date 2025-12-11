class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);          
        int closest = nums[0] + nums[1] + nums[2];  // initial guess

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // Update closest sum if current sum is closer to target
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // Move pointers
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closest;
    }
}
