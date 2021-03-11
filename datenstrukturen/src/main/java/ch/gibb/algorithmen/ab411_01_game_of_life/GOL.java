package ch.gibb.algorithmen.ab411_01_game_of_life;

/**
 * Conway - GAME OF LIFE in Java
 * Made in module 411 "Datenstrukturen & Algorithmen"
 * @author Justin Ceronio 13.02.2021
 */
public class GOL {
    // defined constants for dimensions
    private static int DIM1;
    private static int DIM2;

    /**
     * ENTRY POINT
     * @param args custom dimensions
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            // Use default value
            DIM1 = DIM2 = 12;
        } else {
            // Use custom value
            DIM1 = Integer.parseInt(args[0]);
            DIM2 = Integer.parseInt(args[1]);
        }
        // launch application
        new Controller(DIM1, DIM2);
    }


}
