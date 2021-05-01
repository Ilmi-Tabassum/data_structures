package PRACTICE;


import java.util.Scanner;

public class KMP {
/*
    /**
     * Knuth Morris Pratt algorithm for substring search
     * Constructor takes the pattern that has to be searched
     * time complexity 0(n)
     * @param pat is the pattern to be searched for
     * /
*/

    public static void main(String[] args)  {
        long start=System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern you want to input:");
        String pattern = sc.nextLine();
        System.out.println("ENTER THE TEXT:");
        String txt = sc.nextLine();
        System.out.println("pattern Exist : " + (kmpDFA(pattern, txt) < txt.length()));
        if((kmpDFA(pattern, txt) < txt.length())) {
            System.out.println("pattern found at : " + (kmpDFA(pattern, txt)));
        }else{
            System.out.println("pattern not found");
        }
        System.out.println("time required  "  +(System.nanoTime()-start)*1e-6+"  ms\n\n");

    }
    //DFA implementation
    public static int kmpDFA(String pat, String txt) {// pat : pattern to be searched

        int m = pat.length();// length of pattern
        /* compute dfa[][j] */
        int[][] dfa = new int[256][m];// the radix (256 for Extended ASCII)
        dfa[pat.charAt(0)][0] = 1;// move to state 1 if 1st character of pattern is found
        for (int x = 0, j = 1; j < m; j++) {
            for (int c = 0; c < dfa.length; c++) {
                dfa[c][j] = dfa[c][x]; //copy mismatch cases
            }
            dfa[pat.charAt(j)][j] = j+1;  //  For matching character, correct the destination state
            x = dfa[pat.charAt(j)][x];// update mismatch cases   and  Increment the state X
        }
        // simulate operation of DFA on text
        int n;
        n = txt.length();
        int i, j;
        for (i = 0, j = 0; i < n && j < m; i++)
            j = dfa[txt.charAt(i)][j];

        if (j == m) return i - m;   // pattern found
        return n;        // pattern not found
    }
}