package RecursionSorting;

public class bubbleSort {
    public static void bubbleSortRecursion(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

            }
        }
        bubbleSortRecursion(arr, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = {50, 52, 2, 69, 15, 6, 3};
        bubbleSortRecursion(arr, arr.length);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
