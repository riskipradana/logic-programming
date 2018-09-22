/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturdata.queue;

/**
 *
 * @author riskipradana
 */
public class List {
    private Node head;
    private Node tail;
    private String nama;
    
    public List( String namaList ){     
         nama = namaList;     
         head = tail = null;  
    }   
     
    public void insertLast(Object data){
        Node newNode = new Node(data, null);
        if(head == null){
            head = tail = newNode;
            tail.next = null;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = null;
    } 
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public Object deleteFirst(){
        Object itemDeleted = null;
        if(!isEmpty()){
            itemDeleted = head.getData();
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
        }
        return itemDeleted;
    }
    
    public void print(){
        if(isEmpty()){
            System.out.printf("Kosong %s\n", nama);
        }
        System.out.printf("Isi %s adalah : ", nama);
        Node iterator = head;
        while (iterator != null){
           System.out.printf("%s ", iterator.data);
           iterator = iterator.next;
       }
        System.out.println("\n");
    }
    
}
