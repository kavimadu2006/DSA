import java.util.Scanner;

public class BubbleSort {

    // Bubble Sort Method
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
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

        bubbleSort(numbers);

        System.out.println("Sorted Array:");
        printArray(numbers);

        input.close();
    }
}
