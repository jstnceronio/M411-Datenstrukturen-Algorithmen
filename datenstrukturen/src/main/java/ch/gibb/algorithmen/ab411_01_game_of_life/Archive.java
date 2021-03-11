package ch.gibb.algorithmen.ab411_01_game_of_life;

public class Archive {

    final static int DIM1 = 12;
    final static int DIM2 = 12;

    public static void main(String[] args) {
        boolean[][] welt = initWelt();
        System.out.println("Startkonstellation");
        zeigeWelt(welt);
        for (int i = 0; i <= 100; i++) {
            welt = wendeRegelnAn(welt);
            System.out.println("Generation: " + i);
            zeigeWelt(welt);
        }
    }

    private static boolean[][] initWelt() {
        boolean[][] welt = new boolean[DIM1][DIM2];
        for (int y = 1; y < DIM2 - 1; y++)
            for (int x = 1; x < DIM1 - 1; x++)
                welt[x][y] = Math.random() > 0.4;
        return welt;
    }

    public static int anzNachbarn(boolean[][] welt, int x, int y) {
        int ret = 0;
        for (int i = x - 1; i <= x + 1; ++i)
            for (int j = y - 1; j <= y + 1; ++j)
                if (welt[i][j])
                    ret += 1;
        // einen Nachbarn zuviel gezählt?
        if (welt[x][y])
            ret -= 1;
        return ret;
    }

    public static void zeigeWelt(boolean[][] welt) {
        for (int y = 1; y < DIM2 - 1; y++) {
            for (int x = 1; x < DIM1 - 1; x++) {
                if (welt[x][y])
                    System.out.print("x ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }
    }

    public static boolean[][] wendeRegelnAn(boolean[][] welt) {
        boolean[][] welt_neu = new boolean[DIM1][DIM2];
        int nachbarn;
        for (int y = 1; y < DIM2 - 1; y++)
            for (int x = 1; x < DIM1 - 1; x++) {
                nachbarn = anzNachbarn(welt, x, y);
                if (welt[x][y]) {
                    if ((nachbarn < 2) || (nachbarn > 3))
                        welt_neu[x][y] = false;
                    if ((nachbarn == 2) || (nachbarn == 3))
                        welt_neu[x][y] = true;
                } else {
                    if (nachbarn == 3)
                        welt_neu[x][y] = true;
                }
            }
        return welt_neu;
    }
}
