package RecursionSorting;
//Ilmi Tabassum ID:17101130

import java.util.Scanner;
public class SORT {
    Node head;

    public static class Node {
        Node prev;
        int val;
        Node next;

        public Node(int v, Node n) {
            val = v;
            next = n;
        }

        public Node(int v, Node n, Node p) {
            val = v;
            next = n;
            prev = p;
        }
    }

    public Node linkedList(int[] arr) {
        head = new Node(arr[0], null);
        Node tail = head;

        for (int i = 1; i < arr.length; i++) {
            tail.next = new Node(arr[i], null);
            tail = tail.next;

        }
        return head;
    }

    public Node DoublylinkedList(int[] array) {
        head = new Node(array[0], null, null);
        Node tail = head;

        for (int i = 1; i < array.length; i++) {
            Node temp = new Node(array[i], null, null);
            tail.next = temp;
            temp.prev = tail;
            tail = tail.next;
        }
        return head;
    }

    public void sortSelection(Node head) {
        for (Node a = head; a.next != null; a = a.next) {
            Node minIndex = a;
            for (Node b = a.next; b != null; b = b.next)
                if (b.val < minIndex.val) {
                    minIndex = b;
                }
            int temp = minIndex.val;
            minIndex.val = a.val;
            a.val = temp;
        }
    }

    public void sortInsertion(Node head) {
        for (Node i = head; i != null; i = i.next) {
            int temp = i.val;

            Node j = i;

            while (j.prev != null && j.prev.val > temp) {
                j.val = j.prev.val;
                j = j.prev;
            }
            j.val = temp;
        }

    }


    public void showList() {

        for (Node n = head; n != null; n = n.next) {
            System.out.print(n.val + " ");
        }
        if (head == null) {
            System.out.println("empty list");
        }
    }

    public static void selection(int[] array, int startIndex, int endIndex) {
        if (startIndex == endIndex) { //base case
            return;
        }
        int minIdx = startIndex;
        int j = startIndex + 1;
        while (j < array.length) {
            if (array[j] < array[minIdx]) {
                minIdx = j;
            }
            j++;
        }
        if (minIdx != startIndex) {
            int temp = array[minIdx];
            array[minIdx] = array[startIndex];
            array[startIndex] = temp;
        }

        selection(array, startIndex + 1, endIndex);
    }

    public static void Insertion(int[] array, int y) {
        if (y >= array.length) {
            return;
        }
        int temp, j;
        int i = 0;
        while (i < array.length) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = temp;
            i++;
        }
        Insertion(array, y + 1);

    }


    public void Bubblesort(Node head) {

        for (Node a = head; a != null; a = a.next) {
            Node num;
            for (num = a.next; num != null; num = num.next)

                if (a.val > num.val) {
                    int t = a.val;
                    a.val = num.val;
                    num.val = t;
                }
        }
        showList();
    }




    public static int binaryRecursion(int[] a, int low, int high, int x){
        int mid  =  low + (high - low) /2 ;
        if (low <= high) {
            if(x == a[mid]){
                return mid;
            }
            else if( x> a[mid]) return binaryRecursion(a, mid + 1, high, x);

            else return binaryRecursion(a, low, mid - 1, x);

        } else return -1;
    }
    public static void printarray(int[] arr) {
        for (int j : arr) {

            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static long fibonacci(long n) {
        if(n==0 ){
            return 0;
        }else if(n==1){
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {

        System.out.println("\n :# Original List #:");
        int[] arr = {1, 150, 210, 910, 115, 610, 310};

        for (int Ori : arr) {

            System.out.print(Ori + ",");
        }
        //selection sort TASK01 :
        System.out.println("\n :# TASK01 : Selection sort #:");

        selection(arr, 0, arr.length - 1);


        for (int p : arr) {

            System.out.print(p + ",");

        }
        System.out.println("\n: Task6 : # Binary Search   #");
        System.out.println("\n Enter the element you want to search:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int index = binaryRecursion(arr, 0, arr.length-1,x);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found at Index: "+index);
        }


        //Insertion sort TASK02 :
        int[] array = {65, 10, 20, 90, 15, 61, 31};
        System.out.println("\n : TASK02 :# Insertion SORTING #:");
        printarray(array);
        Insertion(array, 0);
        System.out.println("\n : After Insertion SORTING #:");
        printarray(array);



//bubble sort TASK03 :
        SORT test = new SORT();
        int[] arrs1 = {5, 50, 20, 90, 15, 60, 30};
        Node input = test.linkedList(arrs1);
        System.out.println("\n  :TASK03 : # Original  array #: ");
        test.showList();

        System.out.println("\n :# Bubble Sort linked list SORTING #:");
        test.Bubblesort(input);


//Selection Sort linked list TASK04:
        SORT test2 = new SORT();
        int[] arr1 = {15, 150, 120, 190, 115, 610, 310};
        Node input1 = test2.linkedList(arr1);
        System.out.println("\n :: TASK04: # Original  array #: ");
        test2.showList();
        System.out.println("\n  # Selection Sort linked list SORTING #: ");
        test2.sortSelection(input1);
        test2.showList();

//DOUBLY linked sequential list using insertion sort TASK05:
        SORT test3 = new SORT();
        int[] a = {50, 500, 200, 900, 105, 600, 300};
        Node Doubly1 = test3.DoublylinkedList(a);
        System.out.println("\n : TASK05: # Original  array #: ");
        test3.showList();

        System.out.println("\n:# Insertion Sort Doubly linked list SORTING #: ");
        test3.sortInsertion(Doubly1);
        test3.showList();
        //Fibonacci series:
        System.out.println("\n # :TASK07 : Enter the value of nth term you want to print Fibonacci series #: ");
        int v = sc.nextInt();


        for (int n = 0; n < v+1; n++) {

            System.out.println("Value of  " +n+ "th number in Fibonacci series->" + fibonacci(n));

        }
    }
}










