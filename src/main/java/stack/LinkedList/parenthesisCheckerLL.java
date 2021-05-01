package stack.LinkedList;

import java.util.Scanner;

public class parenthesisCheckerLL {
    public static String checkBalance(String str) {
        int k = str.length();
        StackUsingLinkedlist stack = new StackUsingLinkedlist();
        //stack.JStack(k);
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '[' || ch == '(' || ch == '{') {
                stack.push(ch);
            } else if ((ch == ']' || ch == '}' || ch == ')')
                    && (!stack.isEmpty())) {
                if (((char) stack.peek() == '(' && ch == ')')
                        || ((char) stack.peek() == '{' && ch == '}')
                        || ((char) stack.peek() == '[' && ch == ']')) {
                    stack.pop();
                } else {
                    return "Not Balanced";
                }
            } else {
                if ((ch == ']' || ch == '}' || ch == ')')) {
                    return "Not Balanced";
                }
            }

        }

        if (stack.isEmpty())
            return "Balanced Parenthisis";
        else
            return "Not Balanced";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern you want to input:");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            System.out.println("Empty String");
            return;
        } else {
            System.out.println(parenthesisCheckerLL.checkBalance(str));
        }
        //System.out.println(BalancedParenthisisCheck.checkBalance(str));

    }
}

