package recursionBondho;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int T1d = scn.nextInt();
        int T2d = scn.nextInt();
        int T3d = scn.nextInt();
        toh(n, T1d, T2d, T3d);
    }

    public static void toh(int n, int T1d, int T2d, int T3d){

        if(n ==0){
            return;
        }
        toh(n-1, T1d, T3d, T2d);//  moving B and  C form t1 to t3 usinf t2
        System.out.println(n + " [   Moving C and b:  ]" + T1d + "****)=" + T2d);

        toh(n-1, T3d, T2d, T1d );
}
}
