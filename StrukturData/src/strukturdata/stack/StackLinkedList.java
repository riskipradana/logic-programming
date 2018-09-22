package strukturdata.stack;

import java.util.EmptyStackException;
/**
 *
 * @author riskipradana
 */

class Node{
    Object data;
    Node next;
    
    Node(Object data){
        this.data = data;
    }
}

public class StackLinkedList {
    private Node head, tail, top;
    
    public StackLinkedList(){
        head = tail = top = null;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public Object pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Object dataPop = top.data;
        removeLast();
        top = tail;
        return dataPop;
    }

    private void removeLast() {
        Node temp = head;
        if(!isEmpty()){
            if(tail == head){
                head = tail = null;
            }
            else{
                while (temp.next != tail){
                    temp = temp.next;
                }
                temp.next = null ;
                tail = temp;
            } 
        }
    }
    public void push(Object data){
        addLast(data);
        top = tail;
    }

    private void addLast(Object data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public Object peek(){
        return top.data; 
    }
    
    public void cetak(){
        Node iterator = head;
        while(iterator != null){
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        StackLinkedList stackLL = new StackLinkedList();
        stackLL.push(1);
        stackLL.push(2);
        stackLL.push(3);
        System.out.println("stack contents : ");
        stackLL.cetak();
        
        System.out.println("pop results: ");
        while(!stackLL.isEmpty()){
            System.out.println(stackLL.pop());
        }
    }
}