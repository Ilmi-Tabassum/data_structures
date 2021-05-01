package STACKCHECKER;

public class StackList {
    private class Node {

        int data; // integer data
      Node link; // reference variable Node type
    }

Node top;

    StackList()
    {
        this.top = null;
    }


    public void push(int x) // insert at the beginning
    {

     Node temp = new Node();

        if (temp == null) {
            System.out.print("\nstack Overflow");
            return;
        }


        temp.data = x;


        temp.link = top;

        top = temp;
    }

    public boolean isEmpty()
    {
     //   System.out.println("list empty");
        return top == null;

    }

    // Utility function to return top element in a stack
    public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop()
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }


        top = top.link;
    }

}
