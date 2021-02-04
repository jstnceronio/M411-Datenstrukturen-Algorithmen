package ch.gibb.algorithmen.ab411_02_collatz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Collatz {
    public static void main(String[] args) {
        // procedural
        collatz_procedure(19);

        // recursive
        System.out.println("Rekursive Berechnung: ");
        collatz_rek(19);
    }

    public static void collatz_procedure(long n) {
        // Counter
        int i = 0;

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
            i++;
            System.out.print(n + ", ");
        }
        System.out.println("Fertig!");
    }

    static void collatz_rek(int pN){
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
