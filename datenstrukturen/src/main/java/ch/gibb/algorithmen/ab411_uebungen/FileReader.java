package ch.gibb.algorithmen.ab411_uebungen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) throws FileNotFoundException {

        // file im scanner angeben
        Scanner sc = new Scanner(new File(".\\datenstrukturen\\src\\main\\java\\ch\\gibb\\algorithmen\\ab411_uebungen\\demo.csv"));
        sc.useDelimiter(",");   // set csv muster
        String[] ctnt = new String[10];
        int ctr = 0;
        while (sc.hasNext())
        {
            ctnt[ctr] = sc.next();
            ctr++;
        }
        sc.close();

        for (String s : ctnt) {
            if (s!=null)
                System.out.print(s);
        }
    }
}

