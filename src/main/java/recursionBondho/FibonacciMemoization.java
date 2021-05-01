package recursionBondho;

import java.util.Scanner;

public class FibonacciMemoization {
    public static int fibArray[] = new int[10];

    public static long fibonacci(int n) {
        long fibValue = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;

        } else {
            fibValue = fibonacci(n - 1) + fibonacci(n - 2);
            fibArray[n] = (int) fibValue;
            return fibValue;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        fibArray[0] = 1;
        fibArray[1] = 1;
        for (int n = 0; n < x+1; n++) {

            System.out.println("Value of" +n+ "th number in Fibonacci series->" + fibonacci(n));

        }
    }
}

