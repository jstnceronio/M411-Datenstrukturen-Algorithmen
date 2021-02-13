package ch.gibb.algorithmen.ab411_05;

public class Controller {

    public Controller(int DIM1, int DIM2) {
        // initialise new field
        Field gamefield = new Field(DIM1, DIM2);
        // show world
        gamefield.displayWorld();
        System.out.println("Startkonstellation");
        // run through 100 generations
        gamefield.update(100);
    }
}
