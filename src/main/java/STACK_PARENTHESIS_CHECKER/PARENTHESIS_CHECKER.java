package STACK_PARENTHESIS_CHECKER;

public class PARENTHESIS_CHECKER {
    public void ParenthesesChecker(String counter, int x) {

        if (x == 0) {

            System.out.println(" LIST IMPLEMENTATION:");
            STACK_LinkedList Stacklist = new STACK_LinkedList();

            char[] ent = counter.toCharArray();

            int indexing = 0;
            for (char c : ent) {
                if (c == '[' || c == '{' || c == '(') {
                    Stacklist.push(indexing);
                    Stacklist.push(c);
                } else if ((c == ']' || c == '}' || c == ')') && (!Stacklist.isEmpty())) {
                    if (((char) Stacklist.peek() == '(' && c == ')') ||

                            ((char) Stacklist.peek() == '{' && c == '}') ||
                            ((char) Stacklist.peek() == '[' && c == ']')) {
                        Stacklist.pop();
                        Stacklist.pop();

                    }
                }

                indexing++;
            }


            if (Stacklist.isEmpty() == true) {
                System.out.println("This expression is correct.");

            } else {
                System.out.println("This expression is NOT correct.");
                int a = Stacklist.finale();
                char exp = (char) a;


                System.out.println("EXPRESSION : " + exp);
                System.out.println("Error at character #: " + Stacklist.finaleIndex());
                if (exp == '[' || exp == '(' || exp == '{')
                    System.out.print("  not closed.");
                else if (exp == ']' || exp == '}' || exp == ')')
                    System.out.print(" not opened.");
            }


        } else if (x == 1) {
            System.out.println(" STACK IMPLEMENTATION:");
            int k = counter.length();
            STACK_Array arrS = new STACK_Array();
            arrS.Stack(k * 2);
            char[] input = counter.toCharArray();

            int indexing = 0;
            for (char c : input) {
                if (c == '[' || c == '(' || c == '{') {
                    arrS.push(indexing);
                    arrS.push(c);
                } else if ((c == ']' || c == '}' || c == ')')
                        && (!arrS.isEmpty())) {
                    if (((char) arrS.peek() == '(' && c == ')')
                            || ((char) arrS.peek() == '{' && c == '}')
                            || ((char) arrS.peek() == '[' && c == ']')) {
                        arrS.pop();
                        arrS.pop();

                    }
                }
                indexing++;
            }


            if (arrS.isEmpty()==true) System.out.println("Balanced" );
            else{
                Object arr = arrS.pop();
                char exp = (char)arr ;
                System.out.println("Not Balanced");
                System.out.println("Expression: " +arr);

                if (exp == '[' || exp == '(' || exp == '{')
                    System.out.print(" not closed.");
                else if (exp == ']' || exp == '}' || exp == ')')
                    System.out.print(" not opened.");
                System.out.print("index at: " + arrS.pop());

            }
        }
    }
}








