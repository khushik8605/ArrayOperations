// ArrayFunctions.java
public class ArrayFunctions {

    public static void separateEvenOdd(int[] numbers) {
        int[] even = new int[numbers.length];
        int[] odd = new int[numbers.length];
        int evenIndex = 0, oddIndex = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                even[evenIndex++] = num;
            } else {
                odd[oddIndex++] = num;
            }
        }

        // Print the even and odd arrays
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }

    public static int findSmallestDistance(int[] numbers) {
        int minDistance = Integer.MAX_VALUE;
        int index = -1;

        // Loop to find the pair with the smallest distance
        for (int i = 0; i < numbers.length - 1; i++) {
            int distance = Math.abs(numbers[i] - numbers[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }

        return index;  // Return the index of the first number
    }
}
