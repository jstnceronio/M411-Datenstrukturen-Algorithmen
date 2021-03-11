package ch.gibb.algorithmen.ab411_04_quicksort;

import ch.gibb.algorithmen.ab411_tools.Helper;
import ch.gibb.algorithmen.ab411_tools.StdOut;
import ch.gibb.algorithmen.ab411_tools.Stopwatch;

/**
 *  AB411_2_QUICKSORT
 *  @date 04.03.21
 */
public class Quicksort {

    public static void main(String[] args) {
        int x = Helper.readLength();
        int[] list = Helper.randomIntArray(x, 100);
        Helper.printList(list);

        Stopwatch stopwatch = new Stopwatch();
        int[] sortedList = sort(list, 0, list.length - 1);
        double time = stopwatch.elapsedTime();
        Helper.printList(sortedList);
        StdOut.printf("Elapsed time: %.2f seconds\n", time);
    }

    /**
     * Quicksort recursion.
     * @param arr to be sorted.
     * @param l left side of pivot.
     * @param r right side of pivot.
     * @return sorted partition.
     */
    public static int[] sort(int[] arr, int l, int r) {
        int q;
        if (l < r) {
            q = partition(arr, l, r);
            sort(arr, l, q);
            sort(arr, q + 1, r);
        }
        return arr;
    }

    /**
     * Parts given array - quicksort.
     * @param arr to be parted.
     * @param l left side of pivot.
     * @param r right side of pivot.
     * @return
     */
    static int partition(int[] arr, int l, int r) {
        int i, j, x = arr[(l + r) / 2];
        i = l - 1;
        j = r + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < x);

            do {
                j--;
            } while (arr[j] > x);

            if (i < j) {
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
            } else {
                return j;
            }
        }
    }
}
