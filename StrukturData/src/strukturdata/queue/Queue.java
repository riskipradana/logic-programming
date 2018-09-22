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
public class Queue {
    private List listQueue;
    
    public Queue(){
        listQueue = new List("queue");
    }
    
    public void enqueue(Object object){
        listQueue.insertLast(object);
    }
    
    public Object dequeue(){
        return listQueue.deleteFirst();
    } 
    
    public boolean isEmpty(){
        return listQueue.isEmpty();
    }
    
    public void print(){
        listQueue.print();
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.print();
        q.enqueue(2);
        q.print();
        q.enqueue(3);
        q.print();
        q.enqueue(4);
        q.print();
        
        Object itemDeleted = null;
        while(!q.isEmpty()){
            itemDeleted = q.dequeue();
            System.out.printf("%s dihapus \n", (Integer) itemDeleted);
            q.print();
        }
        
    }
}
