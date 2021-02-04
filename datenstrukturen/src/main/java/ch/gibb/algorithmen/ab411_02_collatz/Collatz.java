package ch.gibb.algorithmen.ab411_02_collatz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Collatz {
    public static void main(String[] args) {
        // procedural
        collatz_procedure(19);

        // functional
        collatz_functional();
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

    private static void collatz_functional() {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.println("Bitte Nummer eingeben: ");
            int n = Integer.parseInt(br.readLine());

            // Confirm
            System.out.println("Collatz-Berechnung für: " + n);
            System.out.println("Funktionale Berechnung: ");

            // WIP -> functional??
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                System.out.print(n + ", ");
            }
            System.out.println("Fertig!");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
