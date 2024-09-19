public class searchinsert {
    // 搜索插入算法，用了左闭右开的二分搜索 https://leetcode.cn/problems/search-insert-position/description/
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            }
            else if (target < nums[mid]) {
                right = mid;
            }
            else return mid;
        }
        return right;
    }
    public static void main(String[] args) {
    }
}
