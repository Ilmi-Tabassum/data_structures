package RecursionSorting;
import java.util.*;
public class TilingDemons {


        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                int n = sc.nextInt();
                if (n == -1) break;
                // Solution1:
                System.out.println(solution1(n));

            }
        }


        private static int solution1(int n) {
            int[][] dp = new int[n + 1][1 << 3];
            dp[0][7] = 1;
            for (int i = 1; i < n + 1; i++) {
                // The number of empty states for this column is the number
                // of full states in the previous column.
                dp[i][0] += dp[i - 1][7];

                dp[i][1] += dp[i - 1][6];

           

                dp[i][3] += dp[i - 1][7];
                dp[i][3] += dp[i - 1][4];

                dp[i][4] += dp[i - 1][3];


                dp[i][6] += dp[i - 1][7];
                dp[i][6] += dp[i - 1][1];

                dp[i][7] += dp[i - 1][3];
                dp[i][7] += dp[i - 1][6];
                dp[i][7] += dp[i - 1][0];
            }
            // printMatrix(dp);
            return dp[n][7];
        }

        private static void printMatrix(int[][] dp) {
            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < 1 << 3; j++) {
                    System.out.printf("% 5d,", dp[i][j]);
                }
                System.out.println();
            }
        }

        private static int solution2(int n) {
            int[] dp = new int[n + 4];
            dp[0] = 1;
            dp[2] = 3;
            for (int i = 4; i < n + 4; i += 2) {
                dp[i] = 4 * dp[i - 2] - dp[i - 4];
            }
            return dp[n];
        }
    }
