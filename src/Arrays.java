public class Arrays {
    public static void main(String[] args) {
        //  Arrays — storing and processing multiple values efficiently
        // An array is a collection of elements of the same data type stored in continuous memory locations.

        // Declaration
        int[] arr;

        // Initialization
        arr = new int[5];
        // or
        int[] arr2 = {1, 2, 3, 4, 5};

        //Traversal
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // Basic Problems
        // 1. Sum of Elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr2[i];
        }
        System.out.println("Sum of Elements in Array : " + sum);

        // 2. Maximum Element
        int max = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }
        System.out.println("Max Element : " + max);

        // 3. Minimum Element
        int min = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (min > arr2[i])
                min = arr2[i];
        }
        System.out.println("Min Element : " + min);

        // 4. Reverse Array (Using two pointers)
        int start = 0;
        int end = arr2.length - 1;

        while (start < end) {
            int temp = arr2[start];
            arr2[start] = arr2[end];
            arr2[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // 5. Linear Search
        int target = 4;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == target) {
                System.out.println("Target Found at index " + i);
                break;
            }
        }

        /*
        What is 2d Array ?

        A 2D array is an array of arrays.
        Think of it like a table or matrix
         */

        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Traversing 2d array
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
        }
        System.out.println();

        // Basic Problems
        // 1. Print Matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 2. Row-wise Sum
        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 0;

            for (int col = 0; col < matrix[row].length; col++) {
                rowSum += matrix[row][col];
            }
            System.out.print("Row : " + row + " Sum : " + rowSum + ". ");
        }
        System.out.println();

        // 3. Column-wise sum
        for (int col = 0; col < matrix[0].length; col++) {
            int colSum = 0;

            for (int row = 0; row < matrix.length; row++) {
                colSum += matrix[row][col];
            }
            System.out.print("Column : " + col + " Sum : " + colSum + ". ");
        }
        System.out.println();

        // 4. find max element
        int maxElement = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (max < matrix[row][col])
                    max = matrix[row][col];
            }
        }
        System.out.println("Max Element in 2d Matrix : " + max);

        // 5. Transpose of matrix
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
