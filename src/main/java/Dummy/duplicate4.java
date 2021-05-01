package Dummy;

//@ ILMI TABASSUM ID:17101130

public class duplicate4 {
    Node head = null;
    Node tail = null;

    public void addNode(int data) {
            Node newNode = new Node(data, null);

            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }




    public void removeDuplicate() {
            Node curr = head, idx = null, temp = null;
            if(head == null) {
                return;
            }
            else {
                while(curr != null){
                    temp = curr;
                    idx = curr.next;
                    while(idx != null) {
                        if(curr.element == idx.element) {
                            temp.next = idx.next;
                            System.out.println(idx.element);
                            return;
                        }
                        else {
                            temp = idx;
                        }
                        idx = idx.next;
                    }
                    curr = curr.next;
                }
            }
        }

    public void showList() {
        Node curr = head;
        if(head == null) {
            System.out.println("\nLIST is Empty");
        }
        for (; curr.next != null; curr = curr.next) {
            System.out.print(curr.element + " → ");
        }
        System.out.println(curr.element + ". ");
    }



        public static void main(String[] args) {
          duplicate4 elementADD = new duplicate4();

            elementADD.addNode(10);
            elementADD.addNode(33);
            elementADD.addNode(33);
            elementADD.addNode(43);
            elementADD.addNode(55);
            elementADD.addNode(10);
            elementADD.addNode(55);
            elementADD.addNode(43);

            System.out.println("Original list: ");
            elementADD.showList();
            System.out.println("Remove first duplicate node: ");
            elementADD.removeDuplicate();
            System.out.println("List after removing first duplicate node: ");
            elementADD.showList();
        }
    }

