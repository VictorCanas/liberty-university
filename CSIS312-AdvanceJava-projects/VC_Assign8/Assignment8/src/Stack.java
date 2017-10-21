/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vscanas
 */


import java.util.LinkedList;
import java.util.List;

public class Stack<T> {
    int size;
    List<T> list;
    
    // Constructor 
    public Stack() {
        list = new LinkedList<T>(); // create empty stack
    }
       
    //return true if this stack is empty

    public boolean isEmpty() {
        return size == 0;
    }
     
     //return object at the top of this stack without removing it from the stack.

    public T peek() {
        return list.get(size - 1);
    } 
    

    //return object at the top of this stack and removing it from the stack.

    public T pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("You cannot pop out of an empty stack");
        } else {
            size--;
            return list.remove(size);
        }
    }
    
     //Pushes an item onto the top of this stack.
    public void push(T item) {
        list.add(item);
        size++;
    }
 
     //return the 1-based position where an item is on this stack.    
    public int search(T item) {
        for (int i = 0; i < size; i++)
            if (list.get(i).equals(item)) {
                return i;
            }
        return -1;
    }
    
    //could not figure out how to do quoutation marks inside quotations
    public String toString() {
        StringBuilder sb = new StringBuilder("'");
        for (T item: list) {
            sb.append(item).append(", ");
        }
        if (size > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("'");
        return sb.toString();
    }
    

     //return size of stack

    public int size() {
        return size;
    }
}