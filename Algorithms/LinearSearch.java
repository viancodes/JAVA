import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index if found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // Ask for array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Ask for target number
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        // Perform Linear Search
        int result = linearSearch(numbers, target);

        // Display result
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not found");
        }

        sc.close();
    }
}
