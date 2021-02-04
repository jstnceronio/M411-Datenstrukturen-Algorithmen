package AB411_02_collatz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Collatz {
    public static void main(String[] args) {
        try {
            collatz(19);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void collatz(int a) throws IOException {

        if (a > 0) {int n = a;} else {System.exit(0);}

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Bitte a eingeben: ");
        a = Double.parseDouble(br.readLine());
        System.out.println("Bitte b eingeben: ");
        b = Double.parseDouble(br.readLine());
        c = Math.abs(a + b/2);
        System.out.println("abs(a + b/2)="+c);
    }
}
