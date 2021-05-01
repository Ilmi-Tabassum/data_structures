
import java.util.Scanner;

public class KMP {


    public static void main(String[] args)  { long start=System.nanoTime();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern you want to input:");
        String pat = sc.nextLine();
        System.out.println("ENTER THE TEXT:");
        String txt = sc.nextLine();
        System.out.println("FINITE AUTOMATA Without Using Pi Table: ");

        System.out.println("Existence of the pattern in the given text: " + (kmpDFA(pat, txt) < txt.length()));
        if((kmpDFA(pat, txt) < txt.length())) {
            System.out.println("pattern found at : " + (kmpDFA(pat, txt)));
        }else{
            System.out.println("pattern not found");
        }
        System.out.println(+(System.nanoTime()-start)*1e-6+"  ms\n\n");
        long kmpTime=System.nanoTime();

        System.out.println("FINITE AUNTOMATA by Using Pi Table AND KMP: ");
        boolean ans = kmpIterative(pat, txt);
        System.out.println("Existence of the pattern in the given text: " +ans);

        System.out.println((System.nanoTime()-kmpTime)*1e-6+"  ms\n\n");
    }

    //Iterative implementation
    public static boolean kmpIterative(String pattern, String text){

        int size = pattern.length();
        int[] π=new int[size];
        for(int j=0;j<size;j++){
            π[j]=longest_prefix_suffix(pattern.substring(0, j+1));

        }

        boolean contains=false;
        int j=0, i=0;
        while(i<text.length()){
            if (pattern.charAt(j) == text.charAt(i)){
                j++;
                i++;
            }
            if (j == size){
                contains=true;
                j = π[j-1];
            }
            else if (i < text.length() && pattern.charAt(j) != text.charAt(i)){
                if (j != 0)
                    j = π[j-1];
                else
                    i = i+1;
            }
        }
        return contains;
    }

    //DFA implementation
    public static int kmpDFA(String pat, String txt) {

        int m = pat.length();
        int[][] dfa = new int[256][m];
        dfa[pat.charAt(0)][0] = 1;
        for (int x = 0, j = 1; j < m; j++) {
            for (int c = 0; c < dfa.length; c++)
                dfa[c][j] = dfa[c][x];
            dfa[pat.charAt(j)][j] = j+1;
            x = dfa[pat.charAt(j)][x];
        }
        // simulate operation of DFA on text
        int n = txt.length();
        int i, j;
        for (i = 0, j = 0; i < n && j < m; i++)
            j = dfa[txt.charAt(i)][j];

        if (j == m)
            return i - m;    // found
        return n;            // not found
    }


    public static int longest_prefix_suffix(String str){
        for(int i=str.length()-2;i>=0;i--){
            if(str.substring(0, i).equals(str.substring(str.length()-i))){
                return i;
            }
        }
        return 0;
    }



}