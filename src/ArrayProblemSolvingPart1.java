public class ArrayProblemSolvingPart1 {
    static double getAverage(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    static int[] multiplyByElement (int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * element;
        }
        return arr;
    }

    static void linearSearch (int[] arr, int target) {
        for (int n : arr) {
            if (n == target) {
                System.out.println("Target Found !!");
                return;
            }
        }
        System.out.println("Target Not Found !!");
    }

    static int maxElement (int[] arr) {
        if (arr.length == 0)    return -1;
        int max = arr[0];
        for (int n : arr) {
            if (max < n) {
                max = n;
            }
        }
        return max;
    }

    static int sumOfPositiveNegative (int[] arr) {
        int positiveSum = 0;
        int negativeSum = 0;
        for (int n : arr) {
            if (n > 0) {
                positiveSum += n;
            } else {
                negativeSum += n;
            }
        }
        return positiveSum + negativeSum;
    }

    static void countZeroesAndOnes (int[] arr) {
        int countZeroes = 0;
        int countOnes = 0;
        for (int n : arr) {
            if (n == 0) countZeroes++;
            if (n == 1) countOnes++;
        }
        System.out.println("Number of Zeroes : " + countZeroes);
        System.out.println("Number of Ones : " + countOnes);
    }

    static int findFirstUnsorted (int[] arr) {
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (num > arr[i]) {
                return arr[i];
            }
            num = arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, -3, 8};
        System.out.println(getAverage(arr));
        multiplyByElement(arr, 10);
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        linearSearch(arr, 80);
        System.out.println(maxElement(arr));
        System.out.println(sumOfPositiveNegative(arr));
        int[] nums = {1, 1, 1, 0, 0};
        countZeroesAndOnes(nums);
        System.out.println(findFirstUnsorted(arr));
    }
}
