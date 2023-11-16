import java.util.*;

public class shellsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println(" enter the array : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Shellsort(arr);
        System.out.println(" sorted array :");
        printArray(arr);
        sc.close();
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Shellsort(int arr[]) {
        int n = arr.length;
        for (int gap = n / 2; gap >= 1; gap /= 2) {

            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i - gap;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + gap] = arr[j];
                    j = j - gap;
                }
                arr[j + gap] = temp;
            }
        }
    }
}
