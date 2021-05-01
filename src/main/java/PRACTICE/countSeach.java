package PRACTICE;
import java.util.Scanner;
public class countSeach {



        public static void main(String[] args) {
            int[] Array = {1, 4, 1, 9, 10, 1, 9, 9};
        //finding max
        int max = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (max < Array[i]) {
                max = Array[i];

            }
        }


        //Finding Minimum

            int min = Array[0];
            for (int i = 1; i < Array.length; i++) {
                if (min > Array[i]) {
                    min = Array[i];
                }
            }

            if ( min > 0) {

                int  [] B = new int[max + 1];
                    for (int i = 0; i < Array.length; i++) {
                        B[Array[i]] = B[Array[i]] + 1;


                    }


                    for (int i = 0; i < B.length; i++) {
                        System.out.println(i + "\t" + B[i]);


                    }

                }
            }
}

