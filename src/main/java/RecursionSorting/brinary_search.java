package RecursionSorting;

public class brinary_search {
//    public  int[] sort(int[] sortArray){
//        for(int i = 0 ; i<sortArray.length ; i++){
//            for(int j = 0 ; j<sortArray.length-1 ; j++){
//                if(sortArray[j+1]<sortArray[j]){
//                    int temp = sortArray[j];
//                    sortArray[j] = sortArray[j+1];
//                    sortArray[j+1] = temp;
//                }
//            }
//        }
//        return sortArray;
//    }
//    public static int[] selection(int[] array, int startIndex, int endIndex) {
//
//        int minIdx = startIndex;
//        for (int j = startIndex + 1; j < array.length; j++) {
//            if (array[j] < array[minIdx]) {
//                minIdx = j;
//            }
//        }
//        if(minIdx != startIndex){
//            int temp = array[minIdx];
//            array[minIdx] = array[startIndex];
//            array[startIndex] = temp;
//        }
//
//        return selection;
//    }

    public int search(int[] arr, int elem){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int middleIndex = (left+right)/2;
            if(arr[middleIndex] == elem){
                return middleIndex;
            }

            else if(arr[middleIndex] < elem){
                left = middleIndex+1;
            }

            else{
                right = middleIndex-1;
            }
        }
return -1;
    }

}
