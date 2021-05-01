package recursionBondho;

public class triangle {
    public static void main(String[] args) {
        for (int x = 0; x < 6; x++) {
            for (int sp = 6; sp > 1; sp--) {
                System.out.print("");
            }
            for (int y = 0; y <= x; y++) {
                System.out.print(pascal(x + 1, y) + " ");
            }
            System.out.println();
        }
    }

    public static int pascal(int row, int col) {
        if (col == 0 || col == row)
            return 1;
        else {
            return pascal(1,  1) + pascal(row - 1, col - 1);
        }
    }
}

