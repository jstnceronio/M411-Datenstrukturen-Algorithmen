package ch.gibb.algorithmen.ab411_07_sorting;


import java.util.Random;
import java.util.Scanner;

public class Sorting {

    /**
     * Entry point
     * @param args
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();

        // Construct random array
        int[] list = randomIntArray(n, 100);

        measure_time("insertion", list);
        measure_time("bubble", list);
    }

    /**
     * Measures elapsed time for either bubble or insertion sort
     * @param context
     * @param list
     */
    public static void measure_time(String context, int[] list) {
        // Use stopwatch to time selection sort
        Stopwatch timer1 = new Stopwatch();

        // start sorting lists
        if (context.equals("insertion"))
            insertion_sort(list);
        else
            bubble_sort(list);

        printList(list);

        double time1 = timer1.elapsedTime();
        System.out.println("Elapsed time for " +  context + "_sort(): "
                + time1 + " milliseconds");
    }

    /**
     * Sorts given list with bubble sort method
     * @param list to be sorted
     */
    private static void bubble_sort(int[] list) {

        for (int n = list.length; n>1; --n) {
            for (int i = 0; i < n - 1; ++i) {
                if (list[i] > list[i+1]) {
                    swap(list, i, i+1);
                }
            }
        }
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

    /**
     * Sorts given list with insertion method
     * @param list to be sorted
     */
    private static void insertion_sort(int[] list) {
        for ( int i = 0; i < list.length; ++i ) {
            int key = list[i];
            int j = i - 1;
            /**
             * Move elements of list a position in front if they're greater than the current element
             */
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    /**
     * Prints given list
     * @param list to be printed
     */
    private static void printList(int[] list) {

        for ( int i = 0; i < list.length; i++ )
            System.out.print(list[i] + " ");

        System.out.println();
    }

    /**
     * Create random int array with given length & size
     * @param length
     * @param size
     * @return numbers array
     */
    public static int[] randomIntArray(int length, int size) {
        Random r = new Random();
        int[] numbers = new int[length];
        for(int i = 0; i < length; i++) {
            numbers[i] = r.nextInt(size+1);
        }
        return numbers;
    }

}
