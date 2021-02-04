package AB411_02_collatz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Collatz {
    public static void main(String[] args) {
        collatz();
    }

    public static void collatz() {
        try {
            int i = 0;

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.println("Bitte Nummer eingeben: ");
            int n = Integer.parseInt(br.readLine());

            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                i++;
                System.out.println("Schritt " + i + ": " + n);
            }
            System.out.println("Fertig!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
