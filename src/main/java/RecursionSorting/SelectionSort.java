package RecursionSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int minIndex;
       // int temp = "";
        String tempS = " ";
        //String min;
      //  int[] a = {37, 38, 90, 2, 1, 4, 5, 0, 199};
        String[] a= {"wjkv","ekw" , "lfef", "fwrk", "ghd", "jdwk"};
        for (int i = 0; i < a.length; i++) {
            minIndex = i; //exchangig indexed
            for( int j = i + 1; j < a.length; j++) {

                if(a[j].compareTo(a[minIndex]) < 0){
                //if (a[j] < a[minIndex]) {
                    minIndex = j;

                }

                }


                tempS = a[i];
                a[i] = a[minIndex];
                a[minIndex] = tempS;
            }
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i] + ".");
            }
        }
    }

