package STACK_PARENTHESIS_CHECKER;

public class STACK_Array {
    private Object[] data;
    private int index = 0;
    private int size = 0;

    public void Stack (int a) {
        this.size = a;
        data = new Object[this.size];
    }

    public void push(Object o) {
        this.data[index] = o;
        index++;

    }

    public Object pop() {
        if (index != 0) {
            Object obj = data[index - 1];
            this.data[index - 1] = null; // Deleted
            index--;
            return obj;
        } else
            return null;
    }

    public Object peek() throws RuntimeException {
        if (index != 0)
            return this.data[index - 1];
        else
            return null;
    }

    public boolean isEmpty() {
        return index == 0;
    }


        }
