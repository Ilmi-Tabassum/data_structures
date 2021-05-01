package PRACTICE;

public class Solution {

        public static int[] countingSort (int[] array) {
            if (array == null || array.length == 0) {
                return array;
            }

            int maxValue = getMax(array);
            int[] temp = new int[maxValue + 1];
            int[] res = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                temp[array[i]] += 1;
            }

            for (int i = 1; i < temp.length; i++) {
                temp[i] ++;
            }

            /*
             * Must from tail to head
             * To keep STABLITY (element originally relative order)
             **/
            for (int i = array.length - 1; i >= 0; i--) {
                res[temp[array[i]] - 1] = array[i];
                temp[array[i]] = temp[array[i]] - 1;
            }

            return res;
        }

        public static int getMax (int[] array) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        /*Main for Test*/
        public static void main(String[] args){
            int[] arrayToSort = new int[] { 0, 3, 1, 0, 5, 2, 4, 5, 2 };
            int[] sortedArray = countingSort(arrayToSort);
            for (int i = 0; i < sortedArray.length; i++){
                System.out.print(sortedArray[i] + ",");
            }
        }
    }

