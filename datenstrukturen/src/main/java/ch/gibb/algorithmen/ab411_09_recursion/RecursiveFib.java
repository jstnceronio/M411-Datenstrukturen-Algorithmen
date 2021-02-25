package ch.gibb.algorithmen.ab411_09_recursion;


import java.util.Scanner;

/**
 *       This program computes Fibonacci numbers using a recursive method.
 */
public class RecursiveFib {

    public static void main(String[] args) {
        // get input
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = in.nextInt();

        for ( int i = 0; i <= n; i++ ) {
            // compute fib
            long f = fib(i);
            System.out.println("fib(" + i + ") = " + f);
        }

    }

    /** Computes fibonacci nrs recursively.
     *
     * @param x int to be computed
     * @return nth fibonacci nr
     */
    private static long fib(int x) {
        if (x<=2)
            return 1;
        else
            return fib(x-1) + fib(x-2);
    }
}
