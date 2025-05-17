class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, 
                           List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));  // Found a valid combination
            return;
        }

        if (target < 0) return;  // Invalid path, exceed the target

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);  // Choose the candidate
            backtrack(candidates, target - candidates[i], i, current, result);  // Reuse same element
            current.remove(current.size() - 1);  // Backtrack step
        }
    }
}
