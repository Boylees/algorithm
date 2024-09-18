public class BinarySearch1 {
    //左闭右闭
    private int search(int[] a, int target) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target > a[mid]){
                left = mid + 1;
            }
            else if (target < a[mid]) {
                right = mid - 1;
            }
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
    }
}
