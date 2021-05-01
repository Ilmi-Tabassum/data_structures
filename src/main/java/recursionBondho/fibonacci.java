package recursionBondho;
import java.util.Scanner;
public class fibonacci {

//
//    static int a = 0, b = 1, c;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println(a + " " + b);
//        fibonacci ob = new fibonacci();
//        int n = sc.nextInt();
//        ob.fib(n);
//    }
//    static void fib(int n) {
//        if (n >= 1) {
//            c = a + b;
//            System.out.println(c);
//            a = b;
//            b = c;
//            fib(n - 1);
//        }
//    }


    public static long fibonacci(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String args[]) {
        long preTime = System.currentTimeMillis();
        System.out.println("Value of 25th number in fibonacci series->" + fibonacci(25));
        long postTime = System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds->" + (postTime - preTime));
    }
}