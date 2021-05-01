package recursionBondho;

import java.util.Scanner;

public class ARRAY {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int max = maxArray(arr, 0);
        System.out.println(max);

        int fi = FirstIndex(arr, 0, d);
       // int fo = LastIndex(arr, )

    //    display(arr, 0);

        System.out.println(fi);
    }

    public static void display(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        display(arr, index + 1);
        System.out.println(arr[index]);
        // display(arr , index+1);

    }

    public static int maxArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int maaz = maxArray(arr, index + 1);
        return Math.max(maaz, arr[index]);

    }

    public static int FirstIndex(int[] arr, int index, int x) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == x) {
            System.out.println("index to search" + x);
            return index;
        } else {
            int interation = FirstIndex(arr, index + 1, x);
                return interation;
            }
        }
    }
