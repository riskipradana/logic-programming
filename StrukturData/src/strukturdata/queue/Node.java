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
public class Node {
      
    Object data;
    Node next;
    
    Node (Object object, Node node){
        data = object;
        next = node;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
    
}
