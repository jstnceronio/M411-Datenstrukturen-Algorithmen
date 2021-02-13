package ch.gibb.algorithmen.ab411_05;

import java.util.ArrayList;

public class Field {

    private Cell[][] world;

    public Field(int DIM1, int DIM2) {

        // create world of cells
        world = new Cell[DIM1][DIM2];

        // populate world
        for (int row = 0; row < world.length; row++) {
            for (int col = 0; col < world[row].length; col++) {
                world[row][col] = new Cell(Math.random() > 0.4);
            }
        }
    }

    public void displayWorld() {
        for (int row = 0; row < world.length; row++) {
            for (int col = 0; col < world[row].length; col++) {
                world[row][col].printCell();
            }
            System.out.println();
        }
    }

    public int getAdjacentFields(int x, int y) {
        int fields = 0;

        for (int i=x-1; i<=x+1; ++i)
            for (int j=y-1; j<=y+1; ++j)
                try {
                    if (world[i][j].isAlive())
                        fields += 1;
                } catch (ArrayIndexOutOfBoundsException e) {
                    // dont care
                }

        // counted a neighbor too much?
        if (world[x][y].isAlive())
            fields -= 1;

        return fields;
    }

    public void applyRules() {
        /*
        1.jede lebendige Zelle, die weniger als zwei lebendige Nachbarn hat, stirbt an Einsamkeit
        2.jede lebendige Zelle mit mehr als drei lebendigen Nachbarn stirbt anÜberbevölkerung
        3.jede lebendige Zelle mit zwei oder drei Nachbarn fühlt sich wohl und lebt weiter
        4.jede tote Zelle mit genau drei lebendigen Nachbarn wird wieder zum Lebenerweckt
         */

        for (int row = 0; row < world.length; row++) {
            for (int col = 0; col < world[row].length; col++) {
                // rule nr 1
                if (getAdjacentFields(row, col) < 2) {
                    // dies
                    world[row][col].setAlive(false);
                }
                // rule nr 2
                if (getAdjacentFields(row, col) > 3) {
                    // dies
                    world[row][col].setAlive(false);
                }
                if (getAdjacentFields(row, col) == 2 || getAdjacentFields(row, col) == 3) {
                    // continues to live on
                }
                if (getAdjacentFields(row, col) == 3) {
                    // resurrect
                    world[row][col].setAlive(true);
                }
            }
        }
    }

    public void update(int n) {
        for (int i = 0; i < n; i++) {
            applyRules();
            System.out.println("Gen. " + i);
            displayWorld();
        }
    }
}
