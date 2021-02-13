package ch.gibb.algorithmen.ab411_05_game_of_life;

import java.util.Timer;
import java.util.TimerTask;

/**
 * GOL Controller
 * Conceives game logic
 */
public class Controller {
    // field of cells
    private Field gamefield;
    // timer to be run on start
    private Timer timer = new Timer();

    /**
     * Controls application process
     * @param DIM1 x-size
     * @param DIM2 y-size
     */
    public Controller(int DIM1, int DIM2) {
        // initialise new field
        gamefield = new Field(DIM1, DIM2);
        // show world
        gamefield.displayWorld();
        // run timer
        startTimer();
    }

    /**
     * Ticking timer at 400-ticks per second
     */
    private void startTimer() {
        // Instantiate timer
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                // update world
                gamefield.update();
                try {
                    // wait 1 second
                    Thread.sleep(1000);
                    // clear command line and get rid of previous displays
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (Exception e) {
                    System.out.println("Something went very south! " + e.getStackTrace());
                }
            }
        };
        // config timer
        timer.schedule(tt, 0, 400);
    }
}
