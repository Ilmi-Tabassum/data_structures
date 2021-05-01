package STACK_PARENTHESIS_CHECKER;



 class STACK_LinkedList {

    public static class Node {
        int value;
        Node next;


    }
     Node topstack;
    STACK_LinkedList() {
        topstack = null;
      
    }


     public void push(int elem) {
        Node value = new Node();
        value.value = elem;
        value.next = topstack;
        topstack = value;
    }



    public boolean isEmpty()
    {
        return topstack == null;
    }


    

    public int peek() {
        if (!isEmpty()) {
            return topstack.value;
        } else {

            return -1;
        }
    }


     public int finale(){
         Node temp =topstack;
         return temp.value;

     }

     public int finaleIndex(){
         Node idx = topstack.next;
         return idx.value;
     }
    public void pop()
    {

        if (topstack == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        topstack = topstack.next;
    }
}

