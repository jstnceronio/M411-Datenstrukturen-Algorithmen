package ch.gibb.algorithmen.ab411_uebungen;

import ch.gibb.algorithmen.ab411_tools.Helper;

/**
 * UEBUNG LB2
 * @date 25.03.2021
 */
public class Parker_Peter {

    //
    // AUFGABEN
    //
    // Implementieren Sie hier die Aufgabe 1
    public static int nachbarn(int[][] welt) {

        int count = 0;

        // a)
        if (welt.length != 3)
            return -1;

        for (int i = 0; i < welt.length; i++) {
            if (!(welt[i].length == 3))
                return -1;

            // b)
            for (int j = 0; j < welt[i].length; j++) {
                // middle
                if (welt[i][j] == 1) {
                    if (i == 1 && j == 1) { count--; }
                    count ++;
                }
            }
        }

        return count;
    }
    // Implementieren Sie hier die Aufgabe 2
    public static void bubblesort(int[] liste) {

        for (int n = liste.length; n>1; --n) {
            for (int i = 0; i < n - 1; ++i) {
                if (liste[i] > liste[i+1]) {
                    swap(liste, i, i+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    // Implementieren Sie hier die Aufgabe 3
    public static int binom(int n, int k) {
        if (k == 0) {return 1;}
        if (2*k > n) {
            return binom(n, n-k);
        }
        return (int) ((0.0 + n+1-k) / k*binom(n, k-1));
    }

    // Implementieren Sie hier die Aufgabe 4
    // recursive method
    // is true if arr[i..n-1]
    public static boolean isMaxHeap(int[] arr, int i, int n) {

        // Base case : leaf node
        if (i >= (n - 2) / 2) { return true; }

        // If an internal node and
        // is greater than its
        // children, and same is
        // recursively true for the
        // children
        if (arr[i] >= arr[2 * i + 1]
                && arr[i] >= arr[2 * i + 2]
                && isMaxHeap(arr, 2 * i + 1, n)
                && isMaxHeap(arr, 2 * i + 2, n))
        {
            return true;
        }

        return false;
    }

    // non-recursive method
    private static boolean isMaxHeap(int[] arr) {
        int N = arr.length;
        // start from the first internal node who has children;
        for (int parent = (N - 2) / 2; parent > -1; --parent) {
            int child = 2 * parent + 1; // the left child;
            if (child < N - 1 && arr[parent] < arr[child+1]) child++; // select the bigger child;
            if (arr[parent] < arr[child]) return false; // if parent is smaller than the child;
        }
        return true;
    }

    //
    // ENTRY POINT
    //
    public static void main(String[] args) {

        System.out.println("Test: " + welt_1[2].length);

        System.out.println("LB2-Uebung M411");
        System.out.println("Nachbarn w1: " + nachbarn(welt_1));
        System.out.println("Nachbarn w2: " + nachbarn(welt_2));
        bubblesort(feld);
        System.out.print("Bubble: ");
        printArr(feld);
        System.out.println("Binom: " + binom(5, 2));
        System.out.println("Binom: " + binom(4, 2));
        System.out.println("h1 rec: " + isMaxHeap(h_1, 0, h_1.length -1));
        System.out.println("h1: " + isMaxHeap(h_1));
        System.out.println("h2 rec: " + isMaxHeap(h_2, 0, h_2.length -1));
        System.out.println("h1: " + isMaxHeap(h_2));

    }
    private static int[][] welt_1 = {{1, 0, 1}, {1, 1, 0}, {0, 0, 1}};
    private static int[][] welt_2 = {{0, 0, 0}, {0, 0, 0}};
    private static int[] feld = {2, 34, 12, 6, 99, 2};
    private static int[] h_1 = {20, 8, 11, 8, 9, 9, 10, 2};
    private static int[] h_2 = {20, 8, 11, 8};
}
