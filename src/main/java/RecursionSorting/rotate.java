package RecursionSorting;
import java.util.*;
public class rotate {



        static final int BLANK = 0;
        static final int RED = 1;
        static final int BLUE = 2;

        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            int t = Integer.valueOf(sc.nextLine());

            for (int i = 1; i <= t; i++) {

                String[] line = sc.nextLine().split(" +");
                int n = Integer.valueOf(line[0]);
                int k = Integer.valueOf(line[1]);

                int[][] grid = new int[n][n];

                // read in the NxN grid

                for (int y = 0; y < n; y++) {
                    String str = sc.nextLine();
                    for (int x = 0; x < n; x++) {
                        switch (str.charAt(x)) {

                            case '.':
                                grid[y][x] = BLANK;
                                break;

                            case 'R':
                                grid[y][x] = RED;
                                break;

                            case 'B':
                                grid[y][x] = BLUE;
                                break;

                        }
                    }
                }

                // shift all R's and B's to the right
                grid = gravityToRight(grid, n);

                // find the winners
                boolean redHasWon = isWinning(grid, n, k, RED);
                boolean blueHasWon = isWinning(grid, n, k, BLUE);

                // print result
                String result;
                if (blueHasWon && redHasWon)
                    result = "Both";
                else if (blueHasWon)
                    result = "Blue";
                else if (redHasWon)
                    result = "Red";
                else
                    result = "Neither";

                System.out.printf("Case #%d: %s\n", i, result);

            }


        }


        static int[][] gravityToRight(int[][] grid, int n) {

            int[][] newGrid = new int[n][n];

            // row by row
            for (int y = 0; y < n; y++) {

                // shift them over from right to left
                int shiftedX = n - 1;
                for (int x = n - 1; x >= 0; x--) {
                    if (grid[y][x] != BLANK)
                        newGrid[y][shiftedX--] = grid[y][x];
                }

            }

            return newGrid;

        }

        static boolean isWinning(int[][] grid, int n, int k, int piece) {

            for (int i = 0; i < n; i++) {

                // vertical
                if (countPiecesInRow(grid, piece, i, 0, 0, 1, n) >= k)
                    return true;

                // horizontal
                if (countPiecesInRow(grid, piece, 0, i, 1, 0, n) >= k)
                    return true;

                // diagonal (bottom left to top right)
                if (countPiecesInRow(grid, piece, 0, i, 1, -1, n) >= k)
                    return true;
                if (countPiecesInRow(grid, piece, i, n-1, 1, -1, n) >= k)
                    return true;

                // diagonal (top left to bottom right)
                if (countPiecesInRow(grid, piece, i, 0, 1, 1, n) >= k)
                    return true;
                if (countPiecesInRow(grid, piece, 0, i, 1, 1, n) >= k)
                    return true;

            }

            return false;

        }

        static int countPiecesInRow(int[][] grid, int piece, int x, int y, int dx, int dy, int n) {

            int max = 0;
            int counter = 0;

            while (x >= 0 && y >=0 && x < n && y < n) {

                if (grid[y][x] == piece) {
                    counter++;
                    max = Math.max(max, counter);
                } else {
                    counter = 0;
                }

                x += dx;
                y += dy;

            }

            return max;

        }

    }

