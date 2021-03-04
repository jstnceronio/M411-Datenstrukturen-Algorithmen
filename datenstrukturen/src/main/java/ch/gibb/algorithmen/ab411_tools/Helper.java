package ch.gibb.algorithmen.ab411_tools;

import java.util.Random;
import java.util.Scanner;

/**
 * Tools for constructing and testing my algorithms.
 * @since 04.03.21
 */
public class Helper {

    /**
     * Create random int array with given length & size
     * @param length
     * @param maxSize
     * @return numbers array
     */
    public static int[] randomIntArray(int length, int maxSize) {
        Random r = new Random();
        int[] numbers = new int[length];
        for(int i = 0; i < length; i++) {
            numbers[i] = r.nextInt(maxSize+1);
        }
        return numbers;
    }

    /**
     * Prompts length from console.
     * @return given length;
     */
    public static int readLength() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        return in.nextInt();
    }

    /**
     * Prints given list
     * @param list to be printed
     */
    public static void printList(int[] list) {

        for ( int i = 0; i < list.length; i++ )
            System.out.print(list[i] + " ");

        System.out.println();
    }

    /**
     * Swaps 2 elements
     * @param arr
     * @param a
     * @param b
     */
    public static int[] swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
