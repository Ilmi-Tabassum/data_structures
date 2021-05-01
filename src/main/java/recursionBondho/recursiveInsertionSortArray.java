package recursionBondho;
import java.util.Scanner;
public class recursiveInsertionSortArray {



//    public int[] insertionSort(int[] a) {
//        int i, j, k, temp;
//        for (i = 1; i < a.length; i++) {
//            k = a[i];
//            j = i - 1;
//            while (j >= 0 && k < a[j]) {
//                temp = a[j];
//                a[j] = a[j + 1];
//                a[j + 1] = temp;
//                j--;
//            }
//        }
//        return a;
//    }

        Scanner sc = new Scanner(System.in);
        int arrSize, arr[];
        recursiveInsertionSortArray(int val)
        {
            arrSize = val;
            arr = new int[arrSize];
        }
        void insert() {
            System.out.println("Insert array elements");
            for (int i = 0; i < arrSize; i++) {
                arr[i] = sc.nextInt();
            }
        }

        void show(){
            System.out.println("Array:");
            for (int i =0; i<arrSize; i++){
                System.out.println(arr[i]+ " ");
            }
        }

        void insertionSort(recursiveInsertionSortArray obj){

            insertionSort(obj.arr,obj.arrSize);

        }

        public void insertionSort(int arr[], int arrSize) {
            if(arrSize<=1)
                return;
            insertionSort(arr, arrSize-1);
            int last = arr[arrSize-1];
            int k = arrSize-2;
            for (;k>=0 && last<arr[k]; k--){
                arr[k+1]=arr[k];
                arr[k+1]= last;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//            int arr[] = {7, 5, 34, 65, 34, 23, 12};
            System.out.println("Enter array size");
            int a = sc.nextInt();
            recursiveInsertionSortArray ref = new recursiveInsertionSortArray(a);
            ref.insert();
            ref.show();
            ref.insertionSort(ref);
            ref.show();
//            int ans[]= ref.insertionSort(arr);
//            for (int i=0; i<ans.length;i++){
//
//                System.out.println(ans[i]);
//            }

        }
    }

