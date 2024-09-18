public class BinarySearch2 {
    //左闭右开
    public int search(int[] a, int target) {
        int left = 0, right = a.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (target > a[mid]) {
                left = mid + 1;
            }
            else if (target < a[mid]) {
                right = mid;
            }
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
    }
}
