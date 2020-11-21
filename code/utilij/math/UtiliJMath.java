package utilij.math;

import java.util.Vector;

public class UtiliJMath {
    private static int[] input; // Used for sorting algorithm;
    private static int length; // Used for sorting algorithm;

    public static int FindLargestInt(int[] sort) {
        int highestNum = -2147483648;

        for(int i : sort) {
            if(i > highestNum) {
                highestNum = i;
            }
        }
        return highestNum;
    }

    // Line Segments
    public static Vector2f getMidpoint(Vector2f a, Vector2f b) {
            Vector2f midPoint;
            midPoint = new Vector2f((a.x + b.x) / 2, (a.y + b.y) / 2);
            return midPoint;
    }

    public static int factorial(int factor) {
        if(factor == 1) {
            return factor;
        } else {
            return factor * factorial(factor - 1);
        }
    }

    public static boolean prime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void sort(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return;
        }
        input = numbers;
        length = numbers.length;
        quickSort(0, length - 1);
    }


    private static void quickSort(int low, int high) {
        int i = low;
        int j = high;

        int pivot = input[low + (high - low) / 2];

        while (i <= j) {

            while (input[i] < pivot) {
                i++;
            }
            while (input[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(low, j);
        }

        if (i < high) {
            quickSort(i, high);
        }
    }

    private static void swap(int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}

