package recursionBondho;
import java.io.*;
import java.util.*;
public class power {




        public static void main(String[] args) throws Exception {
            // write your code here

            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            int n = sc.nextInt();
            int num = power(x, n);
            System.out.println(num);

        }
//
//        public static int power(int x, int n){
//            if ( n == 0){
//                return 1;
//            }
//
//            int no = power(x,n-1);
//            int num = x*no;
//            return num;
//        }

    public static int power(int x, int n){

        if(n==0){

            return 1;
        }

        if(n%2==0){

            return power(x,n/2)*power( x,n/2);

        }

        else{

            return x*power(x,n/2)*power(x,n/2);

        }
    }
    }

