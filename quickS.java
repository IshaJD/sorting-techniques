public class quickS {
    public static void main(String[] args) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        System.out.println(" ORIGINAL ARRAY ");
        PrintArray(arr);
        int n = arr.length;
        QuickSort(arr, 0, n - 1);

        System.out.println(" SORTED ARRAY ");
        PrintArray(arr);
    }

    public static void PrintArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void QuickSort(int arr[], int p, int r) {
        if (p < r) {
            int q = Partition(arr, p, r);
            QuickSort(arr, p, q - 1);
            QuickSort(arr, q + 1, r);
        }
    }

    public static int Partition(int arr[], int p, int r) {
        int i = p - 1;
        int x = arr[r];
        for (int j = p; j < r; j++) {
            if (arr[j] <= x) {
                i = i + 1;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, r);
        return i++;
    }
}
