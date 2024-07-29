package TwoPointer;

import java.util.Arrays;

public class SortArrayParity {

    public static void main(String[] args) {
        int nums[] = {4, 1, 2, 3};
        int ans[] = sortEvenOdd(nums);

        System.out.println(Arrays.toString(ans)); // Should print [2, 1, 4, 3]
    }

    private static int[] sortEvenOdd(int[] nums) {
        int len = nums.length;
        int[] evens = new int[(len + 1) / 2]; // Length for even indexed elements
        int[] odds = new int[len / 2];        // Length for odd indexed elements

        int eIndex = 0, oIndex = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                evens[eIndex++] = nums[i];
            } else {
                odds[oIndex++] = nums[i];
            }
        }

        // Sort even and odd indexed arrays using bubble sort
        bubbleSort(evens);
        bubbleSort(odds);

        // Merge sorted arrays back into the original array
        eIndex = 0;
        oIndex = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                nums[i] = evens[eIndex++];
            } else {
                nums[i] = odds[oIndex++];
            }
        }

        return nums;
    }

    // Bubble Sort implementation
    private static void bubbleSort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (nums[i]< nums[j]) {
                    swap(nums, i, j );
                }
            }
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
