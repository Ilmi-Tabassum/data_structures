package AdvancedAlgorithm;
import java.util.Scanner;
public class rabinKarpAlgo {

    public final static int d = 4;

 
    static void search(String input, String txt, int q)
    {
        int text = input.length();
        int str = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;


        for (i = 0; i < text - 1; i++)
            h = (h * d) % q;

        // Calculate the hash value of pattern and first
     
        for (i = 0; i < text; i++) {
            p = (d * p + input.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= str - text; i++) {

     
            if (p == t) {
                /* Check for characters one by one */
                for (j = 0; j < text; j++) {
                    if (txt.charAt(i + j) != input.charAt(j))
                        break;
                }

                if (j == text)
                    System.out.println("Pattern found at index " + i);
                    System.out.println("Pattern Available");

            }

    
            if (i < str - text) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + text)) % q;
                if (t < 0)
                    t = (t + q);
            }
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the pattern you want to input:");
        String makeConcat = sc.nextLine();

        System.out.println("Check if any cyclic pattern exists inside your given pattern:");
        String cyclicChecker = sc.nextLine();

        String concat = makeConcat.concat(makeConcat); //carcar

        int q = 31; // A prime number

        search(cyclicChecker, concat, q);
    }
}


