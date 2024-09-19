class Solution1 {
    //暴力解法
    public int removeElement(int[] nums, int val) {
        int x, n = 0, index = 0;
        int leng = nums.length;
        for (int i = 0; i < leng; i++) {
            if (nums[i] != val) {
                x = nums[i];
                nums[index] = x;
                index++;
                n++;
            }
            else if (nums[i] == val) {
                for (int j = i; j < leng; j++) {
                    if (nums[j] != val) {
                        x = nums[i];
                        nums[i] = nums[j];
                        nums[j] = x;
                        n++;
                        break;
                    }
                }
            }
        }
        return n;
    }
}
