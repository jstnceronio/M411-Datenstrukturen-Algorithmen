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
        String method;

        //while input is wrong
        while (true) {
            System.out.println("Wie soll die Berechnung sein? Procedural/Rekursiv? (p/r)");
            try {
                //get the method from user
                method = scanner.nextLine();
                //if the input is correct
                if(method.equals("p")) {
                    System.out.println("Bitte Startzahl eingeben:");
                    try {
                        //get starting number and then start the calculation
                        collatz_pro(Long.parseLong(scanner.nextLine()));
                    } catch(Exception e) {
                        //if wrong number is entered start over
                        throw new Exception();
                    }
                    //if input is still correct
                } else if (method.equals("r")) {
                    System.out.println("Bitte Startzahl eingeben:");
                    try {
                        //get starting number and then start the calculation
                        collatz_rek(Integer.parseInt(scanner.nextLine()));
                    } catch(Exception e) {
                        //if wrong number is entered start over
                        throw new Exception();
                    }
                } else {
                    //if there is no clear method given start over
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                //start over
                System.out.println("Wrong input!");
            };
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
