import java.io.*;


public class luogu1177 {

    public static int MAXN = 100001;

    public static int[] array = new int[MAXN];

    public static int[] help = new int[MAXN];

    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in = new StreamTokenizer(br);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        in.nextToken();
        n = (int) in.nval;
        for (int i = 0; i < n; i++) {
                in.nextToken();
                array[i] = (int) in.nval;
            }
        MergeSort(0, n - 1);
        for (int i = 0; i < n - 1; i++) {
        out.print(array[i] + " ");
        }
        out.println(array[n - 1]);
        out.flush();
        out.close();
        br.close();
    }

    public static void MergeSort(int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (right - left) / 2 + left;
        MergeSort(left, mid);
        MergeSort(mid + 1, right);
        Merge(left, mid, right);
    }
    public static void Merge(int left, int mid, int right) {
        int i = left;
        int a = left;
        int b = mid + 1;
        while (a <= mid && b <= right) {
            if (array[a] <= array[b]) {
                help[i++] = array[a++];
            }
            else {
                help[i++] = array[b++];
            }
        }
        while (a <= mid) {
            help[i++] = array[a++];
        }
        while (b <= right) {
            help[i++] = array[b++];
        }
        for (i = left; i <= right; i++) {
            array[i] = help[i];
        }
    }
}
