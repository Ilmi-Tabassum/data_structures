package recursionBondho;
import java.util.Scanner;

public class exponent {

    public static int exponentation(int n, int p){

        if(n < 0){
            return 0;
    }else if(p<=0){
            return 1;
        }else{
            return n * exponentation(n, p-1);
        }

        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
        System.out.println(exponentation(x,y));
        }
}
