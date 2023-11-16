import java.util.Scanner;

public class countSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println(" enter the array : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        CountSort(arr);
        System.out.println(" sorted array :");
        printArray(arr);
        System.out.println("the max element is =" + findMax(arr));
        sc.close();
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void CountSort(int arr[]) {
        int n = arr.length;
        int max = findMax(arr);
        int hash[] = new int[max + 1];
        // create a hash array and initialize it with zero
        for (int i = 0; i < max + 1; i++) {
            hash[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        int i = 0, j = 0;
        while (i < max + 1) {
            if (hash[i] > 0) {
                arr[j++] = i;
                hash[i]--;
            } else {
                i++;
            }
        }
    }

    public static int findMax(int arr[]) {
        int max = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
