package CicularArray;

public class CircularArray {

    public static int [] CircularArray(int[] lin, int st){

        int []   cir = new int[lin.length];
        for(int i = 0; i < cir.length; ++i){
            cir[(i+ st)% cir.length] =lin[i];
        }
        System.out.println();
        for (int j : cir) {
            System.out.print(j + ", ");
        }
        return cir;

    }

    public static void printForward(int [] cir, int st, int sz){
        int index = st;

        for(int i = 0 ; i<sz ; i++){

            System.out.print(cir [index]+ ",");
            index = (index+1)%cir.length;
        }

        System.out.println(cir [index]);
    }



    public static boolean Circularpalindrome(int[]cir, int st, int sz){


        int s = st, l = (st + sz - 1) % cir.length;
        boolean check = false;
        for (int i = 0; i < sz / 2; i++) {
            check = cir[s] != cir[l];
            s++;
            l--;
            if (s > cir.length) {
                s = (st + sz) % cir.length;
            }
            if (l < 0) {
                l = cir.length - 1;
            }
        }
        if (!check) {
            System.out.println("This array is not palindrome");
        } else {
            System.out.println("This array is  a palindrome");
        }
        return check;

    }


    public static void InterSection(int[]x, int[]y) {
        {

            int[] x1 = CircularArray(x, 5);


            int[] y1 = CircularArray(y, 8);

            System.out.println("\nCircularArray FOR INTERSECTION: ");


            for (int k : x1) {
                for (int i : y1) {
                    if (k == i) {
                        System.out.println("Common Element : " + k);
                    }
                }
            }
        }
    }
    public static void main(String [] args){
        CircularArray z = new CircularArray();
        int [] linear = {1, 0 ,0 ,1, 0 ,1};


        CircularArray(linear, 2);
        System.out.print("\n" + Circularpalindrome(linear, 0, 4));
        printForward(linear, 0,4);
        int[]x= {40,50,10,20,30};
        int[]y= {10,20,10,5,40,15,25};
        z.InterSection(x,y);
    }
}

