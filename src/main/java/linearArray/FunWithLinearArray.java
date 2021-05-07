package linearArray;

public class FunWithLinearArray {

    public static void main(String [] args){


        int [] array = {10, 20, 30, 40, 50, 60};
        int [] a =     {10,20,30,40,50,0, 0, 0};
        int[] array1 = copyArray(array, array.length); // the main array remain unchanged


        System.out.println("1. Shift Left k cell ");

        shiftLeft(array1,5); // shift values 3 places to the left
        printArray(array1);

        System.out.println();


        System.out.println("2. Rotate Left k cell ");
        array1  = copyArray(array, array.length); // Rotate Left k cells
        rotateLeft(array1,3);
        printArray(array1);


        System.out.println();

        // Remove an element from an array
        System.out.println("3. Remove an element from an array");
        removeAll(a,5,2);
        printArray(a);


        //Remove all occurrences of a particular element from an array
        System.out.println();
        int [] Duplicacy = {10,2,30,2,50,2,2,50,0};
        System.out.println("4. Remove duplicate elements");
        int[] output = remove(Duplicacy, 8 ,2);

        printArray(output);
        System.out.println();

        //  Splitting an Array
        System.out.println ("5.summation weight matches");
        int[] A = {1, 1, 1, 2, 1};
        int[] B = {2, 1, 1, 2, 1};
        int[] C ={10, 3, 1, 2, 10};
        summationMatch(A);
        summationMatch(B);
        summationMatch(C);


        System.out.println ("6.ArraySeries");
        Arrayseries(3);

        System.out.println();
        System.out.println ("7.Most occuring elements");
        int[] source = { 1,1,2, 2, 1,1,1,1 };
        longest_subarray(source);

        int [] a1 = new int [] {3,4,6,3,4,7,4,6,8,6,6};
        repetition(a1);



    }


    public static int[] copyArray(int[] source, int len) {
        int[] copy = new int[len];
        if (copy.length >= 0) System.arraycopy(source, 0, copy, 0, copy.length);
        return copy;
    }



    public static void shiftLeft(int[] source, int k) {
        for (int i = 0; i + k < source.length; i++) {
            source[i] = source[i + k];
            source[i + k] = 0;
        }
    }

    public static void rotateLeft(int[] source, int k) {
        if(k< 0 || k > source.length){
            System.out.println("Array index not available in the given array");

            return;
        }

        for (int i = 0; i + k < source.length; i++) {
            int T = source[i];
            source[i] = source[i + k];
            source[i + k] = T;
        }
    }

    public static void removeAll(int [] array, int size, int indexValue){




        if (size >  array.length){
            System.out.println("Array size exceedes the given array length ");
        }


        if(indexValue< 0 || indexValue > size){
            System.out.println("Array index not available in my array");

            return;
        }


        for(int i = 0 ; i<array.length ; i++){
            if(i == indexValue){
                for(int j = i ; j<array.length-1; j++){
                    array[j] = array[j+1];
                    size--;
                }


                int length = array.length-1;
                array[length] = 0;
                length--;
            }
        }
    }




    public static int[] remove(int[] numbers, int size,  int target) {

        if (size > numbers.length ){
            System.out.println("/n Array space is Invalid");
        }

        int count = 0;

        // loop over an array to count number of target values.

        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }

        // original array doesn't contain number to removed return same array
        if (count == 0) {
            return numbers;
        }

        int[] result = new int[numbers.length];
        int index = 0;
        for (int value :numbers) {
            if (value != target) {
                result[index] = value;
                index++;
            }
        }


        return result;
    }
    public static void printArray(int [] source){
        for( int x : source)
            System.out.print( x + " ");
    }





    public static void summationMatch(int[] Arr ) {

        int[] B = new int[Arr.length];
        int[] C = new int[Arr.length];

        int sum = 0;
        for (int i=0; i< Arr.length; i++) {
            sum += Arr[i];
            B[i] = sum;
        }


        sum = 0;
        for (int i=Arr.length-1; i>=0; i--) {
            sum += Arr[i];
            C[i] = sum;

        }

        for (int i=0; i< Arr.length-1; i++) {
            if (B[i] == C[i+1]) {

                System.out.println("Summation MATCHES "  +B[i]+  "  true");
                return;
            }
        }
        {
            System.out.println("false");

        }
    }

    public static void Arrayseries(int n){
        int [] Arr = new int[n*n];
        int counter=1;

        for (int i=0; i<Arr.length; i++){
            for (int j=0; j< n-(n-(i+1)); j++){
                int index = ((i+1))*n-(j+1);
                if(index<Arr.length-2){
                    Arr[index] = counter;
                    counter = counter+1;
                }
                int k=(n*n)-n;
                for(i = n; i>0; i--){
                    Arr[k]=i;
                    k++;
                }




            }
            for(i = 0; i< Arr.length; i++){
                System.out.print(Arr[i] + ", "); }
        }
    }
    static void  longest_subarray(int[] arr){
        int j=1;
        int k=0;

        for(int i =0; i<arr.length-1; i++){

            if (arr[i]== arr[i+1]) {

                j++;
            }
            else {
                arr[k]=j;
                k++;
                j=1;
            }
            arr [k] = j;
        }


        int max = arr[0];
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        System.out.println("maximum subarray " + max);
    }
    public static void repetition(int[]arr) {

        System.out.println("8. Repetition Array:");

        int [] fr = new int [arr.length];
        int visited= -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }

        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println(  "element " + arr[i] + "    times occuring   " + fr[i]);


        }
    }
}



