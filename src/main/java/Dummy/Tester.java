package Dummy;

public class Tester {

    public static void main(String[]args){
        System.out.println("\nNumber 6");
        int[] arr1 = {4, 5, 3};
        int[] arr2 = {9, 5, 2};
        int[] arr3 = {};

        DummyList cArray1 = new DummyList(arr1);
        System.out.print("\nList1: x →");
        cArray1.showList();
        System.out.println(cArray1.Summation());



        DummyList cArray2 = new DummyList(arr2);
        System.out.print("\nList2: x →");
        cArray2.showList();
        System.out.println(cArray2.Summation());

        double k = cArray2.Summation()+ cArray1.Summation();

        int l = (int) Math.round(k);
        System.out.println("\nSummation of Concat nodes: " + l);


        DummyList cArray3 = new DummyList(arr3);
        String number = String.valueOf(l);
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            cArray3.insert (j);
        }
        System.out.println("\nPrinting the summation nodes: ");
        cArray3.showList();

    }
}

