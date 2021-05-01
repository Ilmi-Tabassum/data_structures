package Dummy;

public class DoublyTester {
    public static void main(String[] args){

        DoublyList task=new DoublyList();
        Object [] arr={10,20,30,40,50};
        task.DoublyList(arr);
        System.out.println("\n print the List " );
        task.printList();

        System.out.println("\nInsertion task ");
        task.insert(33,5);
        task.printList();

        System.out.println("\nRemoval task ");
        task.removal(4);
        task.printList();



        System.out.println("\nInsertion taskLast");
        task.insertAtLast(7);


        task.printList();
        task.removeKey(7);

        System.out.println("\nRemovalKey");
        task.printList();
    }
}
