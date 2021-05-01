package RecursionSorting;

public class selelction {
    public static void main(String[] args){
        int arr[] = {3,10,20,7,3,2};
        printarray(arr);
        selection(arr, 0, arr.length-1);
        printarray(arr);


    }
    public static void printarray(int[] arr){
        for (int i =0 ; i<arr.length ; i++){

            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }




    public static void selection(int[] array, int startIndex, int endIndex) {
        if (startIndex == endIndex) { //base case
            return;
        }
        int minIdx = startIndex;
        for (int j = startIndex + 1; j < array.length; j++) {
            if (array[j] < array[minIdx]) {
                minIdx = j;
            }
        }
        if (minIdx != startIndex) {
            int temp = array[minIdx];
            array[minIdx] = array[startIndex];
            array[startIndex] = temp;
        }
        printarray(array);

        selection(array, startIndex + 1, endIndex);
    }
}
