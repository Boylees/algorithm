class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true; // 0 和 1 是完全平方数
        }

        int left = 1, right = num; // 右边界设为 num
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid; // 使用 long 防止溢出

            if (midSquared == num) {
                return true; // 找到完全平方数
            } else if (midSquared < num) {
                left = mid + 1; // mid 的平方太小
            } else {
                right = mid - 1; // mid 的平方太大
            }
        }

        return false; // 没有找到完全平方数
    }
}
