// Main.java
//Name : Khushi Kashyap
//PRN:23070126060
//Batch : AIML A3
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nChoose a functionality:");
        System.out.println("1. Separate even and odd numbers");
        System.out.println("2. Find the two neighboring numbers with the smallest distance");
        int choice = sc.nextInt();

        // Switch case for function selection
        switch (choice) {
            case 1:
                ArrayFunctions.separateEvenOdd(numbers);  
                break;
            case 2:
                int index = ArrayFunctions.findSmallestDistance(numbers);
                System.out.println("The index of the first number with the smallest distance is: " + index);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
