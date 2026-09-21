
import java.util.Scanner;

public class Sorting {

    // Bubble Sort
    static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min])
                    min = j;
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }
    }

    // Merge Sort
    static void mergeSort(int[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;

            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
            merge(a, p, q, r);
        }
    }

    static void merge(int[] a, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0; i < n1; i++)
            L[i] = a[p + i];

        for (int j = 0; j < n2; j++)
            R[j] = a[q + 1 + j];

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0, j = 0;

        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j])
                a[k] = L[i++];
            else
                a[k] = R[j++];
        }
    }

    // Quick Sort
    static void quickSort(int[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);

            quickSort(a, p, q - 1);
            quickSort(a, q + 1, r);
        }
    }

    static int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p - 1;

        for (int j = p; j < r; j++) {
            if (a[j] <= x) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[r];
        a[r] = temp;

        return i + 1;
    }

    // Print Ascending
    static void printAscending(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // Print Descending
    static void printDescending(int[] a) {
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] original = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            original[i] = sc.nextInt();

        int[] a;

        // Bubble Sort
        a = original.clone();
        bubbleSort(a);
        System.out.println("\nBubble Sort");
        System.out.print("Ascending  : ");
        printAscending(a);
        System.out.print("Descending : ");
        printDescending(a);

        // Selection Sort
        a = original.clone();
        selectionSort(a);
        System.out.println("\nSelection Sort");
        System.out.print("Ascending  : ");
        printAscending(a);
        System.out.print("Descending : ");
        printDescending(a);

        // Insertion Sort
        a = original.clone();
        insertionSort(a);
        System.out.println("\nInsertion Sort");
        System.out.print("Ascending  : ");
        printAscending(a);
        System.out.print("Descending : ");
        printDescending(a);

        // Merge Sort
        a = original.clone();
        mergeSort(a, 0, a.length - 1);
        System.out.println("\nMerge Sort");
        System.out.print("Ascending  : ");
        printAscending(a);
        System.out.print("Descending : ");
        printDescending(a);

        // Quick Sort
        a = original.clone();
        quickSort(a, 0, a.length - 1);
        System.out.println("\nQuick Sort");
        System.out.print("Ascending  : ");
        printAscending(a);
        System.out.print("Descending : ");
        printDescending(a);

        sc.close();
    }
}