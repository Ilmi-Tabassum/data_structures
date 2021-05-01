package STACK_PARENTHESIS_CHECKER;
import java.util.Scanner;
public class TESTER {
    public static void main(String[] args) {
        PARENTHESIS_CHECKER Task = new PARENTHESIS_CHECKER();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Parentheses: ");
        String pt = sc.nextLine();
        System.out.println("CHOOSE ListSTACK or ArraySTACK");
        System.out.println("Press 0 For ListStack ");
        System.out.println("Press 1 For ArrayStack");
        int check = sc.nextInt();
        Task.ParenthesesChecker(pt, check);
        System.out.println();
        System.out.println();
    }
}
