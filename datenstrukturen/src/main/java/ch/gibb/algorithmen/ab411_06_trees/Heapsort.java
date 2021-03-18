package ch.gibb.algorithmen.ab411_06_trees;

import ch.gibb.algorithmen.ab411_tools.Helper;

import java.util.Arrays;

/**
 * Heapsort algorithm for AB411-08.pdf Task 3.
 * @date 18.03.2021
 */
public class Heapsort {

    /**
     * Entry point. Turns args into list.
     * @param args to be converted
     */
    public static void main(String[] args) {

        // get input
        int arr[] = Helper.argsToList(args);
        // validation w/ user
        System.out.println("Your array: " + Arrays.toString(arr));

        // sort array
        sort(arr);

        System.out.println("Sorted array is");
        Helper.printList(arr);
    }

    public static void sort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    private static void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
