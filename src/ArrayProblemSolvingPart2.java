import java.util.HashMap;

public class ArrayProblemSolvingPart2 {
    static void displayArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
    }

    static int[] reverseArray (int[] arr) {
        if (arr.length == 0)    return null;
        if (arr.length == 1)    return arr;
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }

    static int[] shiftElements (int[] arr) {
        int n = arr.length;
        int lastElement = arr[n-1];
        for (int i = n-1; i > 0; i--)   arr[i] = arr[i-1];
        arr[0] = lastElement;
        return arr;
    }

    static void shiftElementByK (int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;
        if (k == 0) return;

        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
    }

    static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void printExtremeAlternatives (int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (left == right) {
                System.out.print(arr[left]);
                return;
            }
            System.out.print(arr[left] + " ");
            System.out.print(arr[right] + " ");
            left++;
            right--;
        }
    }

    static int modeOfArray (int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        int maxFreq = -1;
        int maxFreqElement = -1;

        for (int key : map.keySet()) {
            int currentKey = key;
            int currentKeyFreq = map.get(currentKey);
            if (currentKeyFreq > maxFreq) {
                maxFreq = currentKeyFreq;
                maxFreqElement = currentKey;
            }
        }

        return maxFreqElement;
    }

    static int differenceOfHighestLowestFreqElements (int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        int maxFreq = Integer.MIN_VALUE;
        int maxFreqElement = -1;
        int minFreq = Integer.MAX_VALUE;
        int minFreqElement = -1;

        for (int key : map.keySet()) {
            int currentKey = key;
            int currentKeyFreq = map.get(currentKey);
            if (currentKeyFreq > maxFreq) {
                maxFreq = currentKeyFreq;
                maxFreqElement = currentKey;
            }
            if (currentKeyFreq < minFreq) {
                minFreq = currentKeyFreq;
                minFreqElement = currentKey;
            }
        }

        return maxFreqElement - minFreqElement;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        displayArray(arr);
        System.out.println();

        shiftElements(arr);
        displayArray(arr);
        System.out.println();

        shiftElementByK(arr, 2);
        displayArray(arr);
        System.out.println();

        printExtremeAlternatives(arr);
        System.out.println();

        int[] nums = {1, 1, 1, 2, 2, 4, 4, 4, 4, 4};
        System.out.println(modeOfArray(nums));
        System.out.println(differenceOfHighestLowestFreqElements(nums));

    }
}
