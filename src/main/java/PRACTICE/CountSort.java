package PRACTICE;
import java.util.Scanner;
public class CountSort {
   Scanner sc =  new Scanner (System.in);
    int n = sc.nextInt();
        int range = n;

        int[] count = new int[range];

        public void countsort(int[] arr, int n){
            int output[] = new int[n];

            /* Generate the count array */
            for(int i = 0; i < n; i++){
                count[arr[i]] += 1;
            }

            /* Generate the modified cumulative count array */
            for(int i = 1; i < range; i++){
                count[i] += count[i - 1];
            }

            for(int i = 0; i < n; i++){
                output[count[arr[i]] - 1] = arr[i];
                count[arr[i]] -= 1;
            }

            /* Copy the output array to input array */
            for(int i = 0; i < n; i++){
                arr[i] = output[i];
            }
        }


        public static void main(String[] args){
            CountSort ob = new CountSort();
            int[] arr = {1, 4, 1, 2, 7, 5, 2};
            int n = arr.length;
            ob.countsort(arr, n);
            System.out.println("After sorting");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

