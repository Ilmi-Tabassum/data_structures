package Dummy;
import java.lang.Math;
public class DummyList {
    Node head;

    public DummyList(int[] a) {

        head = new Node(0, null);
        Node n = head;
        for (int i = 0; i < a.length; i++) {
            Node temp = new Node(a[i], null);
            n.next = temp;
            n = n.next;
        }
    }

    public int countNode() {
        int count = 0;
        for (Node n = head.next; n != null; n = n.next) {
            count++;
        }

        return count;
   }

    public Node nodeAt(int idx) {
        if (idx < 0 || idx >= countNode()) {
            return null;
        }

        Node n = head.next;
        for (int i = 0; i < idx; i++, n = n.next) {

        }
        return n;
    }

    public double Summation() {

        Node n = head.next;
        if (n == null) {
            return 0;
        }
        double idx = countNode() - 1;
        double sum = 0;
        while (n != null) {
            sum = sum + n.element * Math.pow(10, idx);
            n = n.next;
            idx--;
        }
        return sum;
    }

//Insertion Method
public void insert(int e) {



        int idx = countNode();

        Node newNode = new Node(e, null);
        if (idx == 0) {
            newNode.next = head.next;
            head.next = newNode;
        } else {
            Node prev = nodeAt(idx - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
    }

    public void showList() {
        Node n = head.next;
           if(n.next == null) {
               System.out.println("\nEMPTY LIST");
                }
           for (; n.next != null; n = n.next) {
            System.out.print(n.element + "→");
        }
        System.out.println(n.element + ". ");
    }
}



