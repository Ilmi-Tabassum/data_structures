package PRACTICE;

public class CountingSort {

    public static int maximumElement(Integer array[]) {
        // Set the largest element to the first for comparison
        int max;

        max = array[1];

        // Compare each element to see which one is larger
        for (int i = 1; i < array.length; i++) {
            // If A[ i ] is greater than the previous max element, set it to the
            // max element
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static void Counting_Sort(Integer[] A, Integer[] B, int k) {
        int[] C;

        C = new int[k + 1];

        // Initialize C to 0
        for (int i = 0; i < C.length; i++) {
            C[i] = 0;
        }

        // If an element is in the array, add one every time it appears
        for (int j = 1; j < A.length; j++) {
            C[A[j]] = C[A[j]] + 1;
        }

        // Add the value of the current term plus the value at the previous term
        for (int i = 1; i <= k; i++) {
            C[i] = C[i] + C[i - 1];
        }

        // Place the elements in array B and subtract 1 from the spot in array C
        for (int j = A.length - 1; j >= 1; j--) {
            B[C[A[j]]] = A[j];
            C[A[j]] = C[A[j]] - 1;
        }

    }


    public static void main(String[] args) {
        Integer[] A = {null, 1,2,3,4,5,6,1,2,3,4,5,6};
        Integer[] B;
        int k;

        B = new Integer[A.length];
        k = maximumElement(A);

        Counting_Sort(A, B, k);


        }


    }


