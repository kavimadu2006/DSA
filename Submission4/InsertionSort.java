import java.util.Scanner;

public class InsertionSort {

    // Insertion Sort Method
    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Display Array
    public static void printArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("\nOriginal Array:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("Sorted Array:");
        printArray(numbers);

        input.close();
    }
}
