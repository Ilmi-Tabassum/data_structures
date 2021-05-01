package PRACTICE;

public class Frequency {

    public static void main(String[] args) {

        //Initialize array
        int[] arr = new int[]{1, 1, 1, 1, 2, 8, 3, 2, 2, 2, 5, 1};
        //finding max
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];

            }
        }
        System.out.println(max);
        //Finding Minimum

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];

            }
        }

        System.out.println(min);

        if (min > 0) {
            int[] B = new int[max + 1];
            for (int i = 0; i < arr.length; i++) {

                int[] fr = new int[arr.length];
                int visited = -1;

                for (i = 0; i < arr.length; i++) {
                    int count = 1;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            count++;
                            //To avoid counting same element again
                            fr[j] = visited;

                        }

                    }

                    if (fr[i] != visited)
                        fr[i] = count;
                }







                //Displays the frequency of each element present in array
                System.out.println("---------------------");
                System.out.println(" Element | Frequency");
                System.out.println("---------------------");
                for (i = 0; i < fr.length; i++) {
                    if (fr[i] != visited)
                        System.out.println("    " + arr[i] + "    |    " + fr[i] );
                }
                System.out.println("---------------------");
            }
        }
    }
}







