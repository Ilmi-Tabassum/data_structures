//package PRACTICE;
//import java.util.Scanner;
//public class Tester{
//    public static void main (String[]args){
//        Scanner k = new Scanner(System.in);
//        int selection;
//        while(true){
//            try{
//                System.out.println("Please, enter:\n1 to select array based stack\n2 to select linked list based stack");
//                selection = k.nextInt();//1 for arrayStack; 2 for listStack
//                if(selection!=1 && selection!=2)
//                    System.err.println("Wrong Selection! Please, try Again.");
//                else break;
//            }
//            catch(Exception e){
//                System.err.println("Input Format Mismatch! Please, try Again.");
//                k.next();
//            }
//        }
//       STACK STACK;
//     if(selection==1)
//      STACK = new STACK();
//       for(int x=1;x<=12;x+=2){
//          try{
//               STACK.push(x);
//          }
//        catch(StackOverflowException e){
//              System.err.println("Stack Full\n"+e);
//          }
//        }
//        System.out.println("toString Output:"+STACK.toString());
//        Object[]array=STACK.toArray();
//        for(int i=0;i<array.length;i++) System.out.println("=> "+array[i]);
//        System.out.println("size: "+STACK.size());
//        System.out.println("isEmpty: "+STACK.isEmpty());
//        System.out.println("Distance of '1' from the top: "+STACK.search(1));
//        try{
//            System.out.println("Popped: "+STACK.pop());
//        }catch(StackUnderflowException e){
//            System.err.println("Stack Empty\n"+e);
//        }
//        try{
//            System.out.println("Popped: "+STACK.pop());
//        }catch(StackUnderflowException e){
//            System.err.println("Stack Empty\n"+e);
//        }
//        try{
//            System.out.println("Popped: "+STACK.pop());
//        }catch(StackUnderflowException e){
//            System.err.println("Stack Empty\n"+e);
//        }
//        System.out.println("size: "+STACK.size());
//        System.out.println("isEmpty: "+STACK.isEmpty());
//
//        System.out.println("Distance of '1' from the top: "+STACK.search(1));
//
//        array=STACK.toArray();
//        for(int i=0;i<array.length;i++) System.out.println("=> "+array[i]);
//        try{
//            System.out.println("Peeked: "+STACK.peek());
//        }catch(StackUnderflowException e){
//            System.err.println("Stack Empty\n"+e);
//        }
//        System.out.println("toString Output:"+STACK.toString());
//        try{
//            System.out.println("Popped: "+STACK.pop());
//        }catch(StackUnderflowException e){
//            System.err.println("Stack Empty\n"+e);
//        }
//        try{
//            System.out.println("Popped: "+STACK.pop());
//        }catch(StackUnderflowException e){
//            System.err.println("Stack Empty\n"+e);
//        }
//        try{
//            System.out.println("Popped: "+STACK.pop());
//        }catch(StackUnderflowException e){
//            System.err.println("Stack Empty\n"+e);
//        }
//        try{
//            System.out.println("Peeked: "+STACK.peek());
//        }catch(StackUnderflowException e){
//            System.err.println("Stack Empty\n"+e);
//        }
//        array=STACK.toArray();
//        for(int i=0;i<array.length;i++) System.out.println("=> "+array[i]);
//        System.out.println("toString Output: "+STACK.toString());
//        System.out.println("size: "+STACK.size());
//        System.out.println("isEmpty: "+STACK.isEmpty());
//        System.out.println("Distance of '1' from the top: "+STACK.search(1));
//
//    }
//}