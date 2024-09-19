public class searchRange  {
    public int[] searchrange(int[] nums, int target) {
        int[] index = {-1, -1};
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            }
            else if (target < nums[mid]) {
                right = mid - 1;
            }
            else {
                for (int i = left; i <= right; i++) {
                    if (nums[i] == target) {
                        index[0] = i;
                        break;
                    }
                }
                for (int j = right; j >= left; j--) {
                    if (nums[j] == target) {
                        index[1] = j;
                        break;
                    }
                }
                return index;
            }
        }
        return index;
    }
}
