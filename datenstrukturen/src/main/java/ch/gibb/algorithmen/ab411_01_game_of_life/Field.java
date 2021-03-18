package ch.gibb.algorithmen.ab411_01_game_of_life;

/**
 * Creates new game field
 * Offers functions to control environment
 */
public class Field {

    // store cells
    private Cell[][] world;
    // generation count
    private int generation;

    /**
     * Instantiates game field
     * @param DIM1 x-size
     * @param DIM2 y-size
     */
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

    /**
     * Shows current world
     */
    public void displayWorld() {
        for (int row = 0; row < world.length; row++) {
            for (int col = 0; col < world[row].length; col++) {
                world[row][col].printCell();
            }
            System.out.println();
        }
    }

    /**
     * Counts neighbor fields with given position
     * @param x position of cell
     * @param y position of cell
     * @return nr of adjacent fields
     */
    public int getAdjacentFields(int x, int y) {
        int fields = 0;

        for (int i=x-1; i<=x+1; ++i)
            for (int j=y-1; j<=y+1; ++j)
                try {
                    if (world[i][j].isAlive())
                        fields += 1;
                } catch (ArrayIndexOutOfBoundsException e) {
                    // not in bounds
                    // don't care
                }

        // counted a neighbor too much?
        if (world[x][y].isAlive())
            fields -= 1;

        return fields;
    }

    /**
     * Apply given rules to game field
     */
    public void applyRules() {
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

    /**
     * Keeps track of world
     */
    public void update() {
        // increment gen count
        generation++;
        // show current world
        displayWorld();
        // apply rules to that world
        applyRules();
        // output current gen
        if (generation == 1)
            System.out.println("Startkonstellation");
        else
            System.out.println("Gen. " + generation);

    }
}
