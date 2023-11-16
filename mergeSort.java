public class mergeSort {
    public static void main(String[] args) {
        int arr[] = { 8, 3, 7, 4, 9, 2, 6 };
        System.out.println(" ORIGINAL ARRAY ");
        PrintArray(arr);
        System.out.println(" SORTED ARRAY ");
        int n = arr.length;
        MergeSort(arr, 0, n - 1);
        PrintArray(arr);
    }

    public static void PrintArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Merge(int arr[], int l, int mid, int h) {

        int m[] = new int[h++];
        int i = l, k = l;
        int j = mid + 1;
        while (i <= mid - 1 && j <= h) {
            if (arr[i] < arr[j]) {
                m[k++] = arr[i++];

            } else {
                m[k++] = arr[j++];

            }
            for (; i <= mid; i++) {
                m[k++] = arr[i];
            }
            for (; j <= h; j++) {
                m[k++] = arr[j];
            }
        }
        for (i = l; i < h; i++) {
            arr[i] = m[i];
        }
    }

    public static void MergeSort(int arr[], int l, int h) {
        int n = arr.length;
        int i = l, j = h;
        int mid = 0;

        if (i < j) {
            mid = (i + j) / 2;
            MergeSort(arr, l, mid);
            MergeSort(arr, mid + 1, h);
            Merge(arr, l, mid, h);
        }
    }
}
