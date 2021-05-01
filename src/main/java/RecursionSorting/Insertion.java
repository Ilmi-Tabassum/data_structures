package RecursionSorting;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = {3, 10, 20, 7, 3, 2};
        printarray(arr);
        Insertion(arr, 0);
        printarray(arr);


    }

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void Insertion(int[] array, int y) {
        if (y >= array.length) {
            return;
        }
        int temp, j;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = temp;
        }
        printarray(array);
        Insertion(array, y + 1);

    }
}
