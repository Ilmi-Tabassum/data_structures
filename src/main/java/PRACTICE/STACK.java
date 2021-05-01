package PRACTICE;

public abstract class STACK implements STACK_TEST{


    public static class Node {
        int value;
        Node next;

        public Node(Object e, Object o) {
        }


        void STACK(){
            value = 0;
            next = null;
        }

        // The number of items on the stack
        public int size(){
            int count = 0;
            for(Node temp = next ; temp!=null ; temp = temp.next){
                count++;
            }
            return count;
        }
        // Returns true if the stack is empty
        public boolean isEmpty(){
            if(next ==null){
                return true;
            }
            return false;
        }
        public void push(Object e) throws StackOverflowException{
            Node nTop = new Node (e , null);
            nTop.next = next;
            next = nTop;
            value++;
        }
        // Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
        public Object pop() throws StackUnderflowException{
            if(next==null){
                throw new StackUnderflowException();
            }
            else{

                Node oTop = next;
                next = next.next;
                oTop.next = null;
                value--;
                return oTop.value;
            }
        }
        // Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
        public Object peek() throws StackUnderflowException{
            if(next==null){
                throw new StackUnderflowException();
            }
            return next.value;
        }
        // Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
        public String toString(){
            Node nTop = next;
            if(nTop==null){
                return "Empty Stack";
            }
            else{
                String s = "[ ";

                for(nTop = next; nTop.next!=null ; nTop = nTop.next){
                    s = s+ nTop.value+" ";
                }
                s = s + nTop.value +" ]";

                return s;
            }
        }
        // Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
        public Object[] toArray(){
            Object[] nArray = new Object[value];
            int i = 0;
            for(Node nTop = next;nTop!=null ; nTop = nTop.next){
                nArray[i] = nTop.value;
                i++;
            }

            return nArray;
        }
        // Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
        public int search(int e){
            int count = 0;
            for(Node nTop = next ; nTop!=null ; nTop = nTop.next)
                if (nTop.value != e)
                    count++;
                else {
                    return count;
                }
            return -1;
        }
    }
}


