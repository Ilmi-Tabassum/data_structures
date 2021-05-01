package STACKCHECKER;

import java.util.Scanner;

public class ParanthesisCheckerArray {
    public static void checkBalance(String str, int x) {

        if (x == 0) {

            StackList listStack = new StackList();

            for (int i = 0; i < str.length(); i++) {

                char paren = str.charAt(i);

                if (paren == '[' || paren == '(' || paren == '{') {
                    listStack.push(paren);
                } else if ((paren == ']' || paren == '}' || paren == ')')  && (!listStack.isEmpty())) {
                    if (((char) listStack.peek() == '(' && paren == ')')  || ((char) listStack.peek() == '{' && paren == '}')
                            || ((char) listStack.peek() == '[' && paren == ']')) {
                        listStack.pop();
                    } else {
                        System.out.println("Not Balanced");
                    }
                } else {
                    if ((paren == ']' || paren == '}' || paren == ')')) {
                        System.out.println("Not Balanced");
                    }
                }

            }

            if (listStack.isEmpty())
                System.out.println("Balanced");
            else
                System.out.println("Not Balanced");
        }
        else if (x == 1) {
            int k = str.length();
            StackArray arrStack = new StackArray();
            arrStack.JStack(k);

            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                if (ch == '[' || ch == '(' || ch == '{') {
                    arrStack.push(ch);
                }
                else if ((ch == ']' || ch == '}' || ch == ')')  && (!arrStack.isEmpty()))
                {
                    if (((char) arrStack.peek() == '(' && ch == ')')
                            || ((char) arrStack.peek() == '{' && ch == '}')
                            || ((char) arrStack.peek() == '[' && ch == ']')) {
                        arrStack.pop();
                    } else {
                        System.out.println("Not Balanced");
                    }
                } else {
                    if ((ch == ']' || ch == '}' || ch == ')')) {
                        System.out.println("Not Balanced");
                    }
                }

            }

            if (arrStack.isEmpty())
                System.out.println("Balanced");
            else
                System.out.println("Not Balanced");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern you want to input:");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            System.out.println("Empty String");


        } else {
            System.out.println("Choose how you want to execute the process.");
            System.out.println("Enter 0 if you want to use the operation with (linkedlist based stack");
            System.out.println("If you want to proceed with array based stack then press 1");
            int x =sc.nextInt();
          ParanthesisCheckerArray.checkBalance(str,x);

        }


    }
}


