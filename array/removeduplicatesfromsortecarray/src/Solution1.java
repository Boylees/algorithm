class Solution1 {
    //自己解法
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 0;
        for (slow = 0; slow < n; slow++) {
            for (int fast = slow + 1; fast < n; fast++)
                if (nums[fast] == nums[slow]) {
                    remove(nums, fast, n);
                    fast--;
                    n--;
                }
        }
        return slow;
    }
    private void remove(int[] nums, int index, int n) {
        for (int i = index; i < n - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }
}
