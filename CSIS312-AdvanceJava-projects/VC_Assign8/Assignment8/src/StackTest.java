/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vscanas
 */
public class StackTest {

    static void showPushInt(Stack<Integer> stack, int a) {
        stack.push(a);
    }

    static void showPopInt(Stack<Integer> stack) {
        int a = stack.pop();
    }

    static void showPushString(Stack<String> stack, String s) {
        stack.push(s);
    }

    static void showPopString(Stack<String> stack) {
        String s = stack.pop();
    }

    public static void main(String[] args) {
        System.out.println("Victor Canas - CSIS 312 - Assignment 8\n");
        
        Stack<Integer> iStack = new Stack<Integer>();
        
         System.out.println("Pushing onto String Stack:" + " '1 2 3 4 5' ");
         showPushInt(iStack, 1);
         showPushInt(iStack, 2);
         showPushInt(iStack, 3);
         showPushInt(iStack, 4);
         showPushInt(iStack, 5);
        System.out.println("The size of the String stack is " + iStack.size);
        System.out.println("The String stack is empty (T/F): " + iStack.isEmpty());
        System.out.println(iStack.pop() + " " +  iStack.pop() + " " + iStack.pop() + " " + iStack.pop() + " " + iStack.pop());
        System.out.println("The String stack is empty (T/F): " + iStack.isEmpty());
        System.out.println("The size of the String stack is " + iStack.size);
        int size;
        try {
            size = iStack.size();
            for (int i = 0; i < size; i++) {
                showPopInt(iStack);
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println();
        
        Stack<String> sStack = new Stack<String>();
        System.out.println("Pushing onto String Stack:" + " 'The rain in Spain' ");
        showPushString(sStack, "The");
        showPushString(sStack, "rain");
        showPushString(sStack, "in");
        showPushString(sStack, "Spain");
        System.out.println("The size of the String stack is " + sStack.size);
        System.out.println("The String stack is empty (T/F): " + sStack.isEmpty());
        System.out.println(  sStack.pop() + " " + sStack.pop() + " " + sStack.pop() + " " + sStack.pop());
        System.out.println("The String stack is empty (T/F): " + sStack.isEmpty());
        System.out.println("The size of the String stack is " + sStack.size);
        size = sStack.size();
        try {
            for (int i = 0; i < size; i++) {
                showPopString(sStack);
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
