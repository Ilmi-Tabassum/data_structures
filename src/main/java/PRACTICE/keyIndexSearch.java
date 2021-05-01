package PRACTICE;

public class keyIndexSearch {
    public static void main(String[] args) {
        int[] Array = {1, 4, 1, 9};

        //finding max
        int max = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (max < Array[i]) {
                max = Array[i];

            }
        }
        System.out.println(max);
        //Finding Minimum

        int min = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (min > Array[i]) {
                min = Array[i];
            }
        }
        System.out.println(min);

            if (min > 0) {
                //public void count(int A[], int size) {
          //     int[] output = new int[size + 1];
                int[] B = new int[max + 1];
                for (int i = 0; i <max; i++) {

                   B[i] = 0;

                }
                for (int i = 0; i < B.length ; i++) {
                    B[Array[i]] = B[Array[i]]+1;
                }
                for (int i = 0; i < B.length; i++) {
                    System.out.println(i + "\t" + B[i]);


            }
        }
    }
}

//    public void count(int array[], int size) {
//        int[] output = new int[size + 1];
//
//        // Find the largest element of the array
//        int max = array[0];
//        for (int i = 1; i < size; i++) {
//            if (array[i] > max)
//                max = array[i];
//        }
//        int[] count = new int[max + 1];
//
//        // Initialize count array with all zeros.
//        for (int i = 0; i < max; ++i) {
//            count[i] = 0;
//        }
//
//        // Store the count of each element
//        for (int i = 0; i < size; i++) {
//            count[array[i]]++;
//        }







