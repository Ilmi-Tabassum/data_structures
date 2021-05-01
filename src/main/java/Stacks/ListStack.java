package Stacks;

public class ListStack implements Stack {

    public class Node {

        Object val;
        Node next;

        public Node(Object v, Node n) {
            val = v;
            next = n;
        }
    }

    int size;
    Node top;


    public ListStack() {
        size = 0;
        top = null;
    }

    //  The number of items on the stack
    public int size() {
        return size;
    }

    //  Returns true if the stack is empty
    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }


    public void push(Object e) throws StackOverflowException {
    Node  nTop = new Node(e, null);
        nTop.next = top;
        top = nTop;
        size++;
    }




    //  Pops the item on the top of the stack, throwing the
//  StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException {
        if (size == 0){
            throw new StackUnderflowException();
    }else

    {
        Node temp = top;
        top = top.next;
        size--;

        return temp.val;
    }

}

    public Object peek() throws StackUnderflowException {
        if (size == 0)
            throw new StackUnderflowException();

        return top.val;
    }

    public String toString() {
      //  Node nTop = top;
        if (top == null) {
            return "Empty Stack";
        } else {
            String s = "[ ";

            for (Node n = top; n.next != null; n = n.next) {
                s = s + n.val + " ";
            }
           // s = s + n.val + " ]";

            return s;
        }
    }


    public int search(Object e) {
        Object[] array = new Object[5];
        Node i = top;
        for (int j = 0; i != null; i = i.next, j++) {
            if (e == i.val) return j;
        }
        return -1;
    }
}


