package ch.gibb.algorithmen.ab411_02_collatz;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class Collatz {

    // getter for tests
    public int getInvocations() {
        return invocations;
    }

    // purely for testing
    private static int invocations = 0;

    public static void main(String[] args) {
        if (args.length >= 2) {
            // procedural
            collatz_procedure(parseLong(args[0]));

            // recursive
            System.out.println("Rekursive Berechnung: ");
            collatz_rek(parseInt(args[0]));
        }
    }

    public static void collatz_procedure(long n) {
        invocations++;

        // Confirm
        System.out.println("Collatz-Berechnung für: " + n);
        System.out.println("Prozedurale Berechnung: ");

        // Process
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(n + ", ");
        }
        System.out.println("Fertig!");
    }

    static void collatz_rek(int pN){
        invocations++;

        System.out.print(pN + ", ");

        if( pN == 1 ) {
            return;
        }
        if( pN % 2 == 0){
            collatz_rek(pN/2);
        }else {
            collatz_rek(3*pN+1);
        }
    }
}
