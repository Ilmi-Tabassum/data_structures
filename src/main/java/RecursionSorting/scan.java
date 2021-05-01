package RecursionSorting;
import java.util.Scanner;

public class scan {

        public static void main (String[]args){

            Scanner sc = new Scanner (System.in);

            brinary_search s = new brinary_search();
          int[] arr = {1, 2,3,4,5,6,7};

            for (int p : arr) {

                System.out.print(p +",");
            }

            System.out.println("Enter the element you want to search:");
            int x = sc.nextInt();
            int index = s.search(arr, x);
            if(index==-1){
                System.out.println("Not Found");
            }
            else{
                System.out.println("Found at Index: "+index);
            }

        }
    }

