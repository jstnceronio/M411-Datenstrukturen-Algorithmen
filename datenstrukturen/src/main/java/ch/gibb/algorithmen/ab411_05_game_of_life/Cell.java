package ch.gibb.algorithmen.ab411_05_game_of_life;

public class Cell {

    private boolean alive;

    public Cell(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean state) {
        this.alive = state;
    }

    public void printCell() {
        if (alive)
            System.out.print("x ");
        else
            System.out.print("- ");
    }
}
