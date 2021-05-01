package KeyIndex;
import java.util.Scanner;
public class keyIndexSearch {
    Scanner sc = new Scanner(System.in);
    int[] B;

    public keyIndexSearch(int[] array, int lon) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + lon;
        }
        for (int j : array) {
            System.out.print(j + " ");

        }

        int max = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("\n Maximum element :" + max);
        B = new int[max + 1];
        for (int j : array) {
            B[j] = B[j] + 1;


        }
        System.out.println("---------------------");
        System.out.println(" Element | Frequency");
        for (int i = 0; i < B.length; i++) {
            System.out.println("    " + i + "    |    " + B[i]);


        }
    }

    public boolean searchElem(int min) {
        System.out.println("enter elem you want to search!");
        int a = sc.nextInt() + min;
        boolean result = false;
        try {
            result = B[a] != 0;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value you have entered is Not Found");
        }
        return result;
    }

    public void sort(int min) {
               int i = 0;
              while (i < B.length) {
               if (B[i] >= 1) {
                System.out.print("->" + (i - min));
                if (B[i] > 1) for (int j = 0; j < B[i] - 1; j++) {
                    System.out.print("->" + (i - min));
                }

            }
            i++;
        }
    }
}




