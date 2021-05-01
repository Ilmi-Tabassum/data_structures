package CicularArray;

import java.util.Random;


    public class RollingChair {




        public static void main (String[]args)
        {
            //In this game there will be 7 participants
            String[] n={"A","B","C","D","E","F","G"};
            System.out.println("\nparticipants: ");
            for (String s : n) {
                System.out.print(s + ">-");
            }
            Game(n);
        }

        public static int random(){
            Random r = new Random();
            int low = 0;
            int high = 4;
            int result = r.nextInt(high-low) + low;
            System.out.println();
            System.out.println("\nRandom Generator: " +result);
            return result;

        }

        public static void Game(String[] array){

            if(array.length==1){
                System.out.println("Winner");
                return;
            }
            int n = array.length/2;

            if (random()==1){
                removal(array, n);
            }
            else {
                rightClockwise  (array,1);
                Game(array);
            }
        }
        //moving clockwise around a set of 7 chairs
        static void rightClockwise (String[] array, int k) {
            for(int i = 0; i < k; i++){
                int j;
                String str;
                str = array[array.length-1];
                for(j = array.length-1; j >0; j--){
                    array[j] = array[j-1];  }
                array[0] = str;
            }
            System.out.println("\nmoving clockwise:: ");
            for (String s : array) {
                System.out.print(s + " ->");
            }
        }


        //Each time a participant is eliminated, a chair will be removed
        public static String[] removal(String[] arr, int idx) {
            if (arr == null || idx < 0 || idx >= arr.length) {
                System.out.println("Invalid");
                return arr;
            }
            String[] a = new String[arr.length - 1];
            int  key = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i == idx) {
                    continue;
                }
                a[key++] = arr[i];
            }
            System.out.println();
            for (String s : a) {
                System.out.print(s + " ");
            }

            Game(a);
            return a;
        }

    }


