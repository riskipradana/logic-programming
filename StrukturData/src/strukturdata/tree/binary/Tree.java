package strukturdata.tree.binary;

import java.util.Random;

/**
 *
 * @author riskipradana
 */

class Node{
    int data;
    Node nodeKiri;
    Node nodeKanan;

    public Node(int data) {
        this.data = data;
        nodeKiri = nodeKanan = null;
    }
    
    public void insert(int newData){
        if (newData < data ){
            if(nodeKiri == null){
                nodeKiri = new Node(newData);
            }else{
                nodeKiri.insert(newData);
            }
        }else if (newData > data){
           if(nodeKanan == null){
               nodeKanan = new Node(newData);
           }else{
               nodeKanan.insert(newData);
           }
        }
    }
}

public class Tree {
    private Node root;
    
    public Tree() {
        root = null;
    }
    
    public void insertNode(int newData){
        if(root == null){
            root = new Node(newData);
        }else{
            root.insert(newData);
        }
    }
    
    public void preOrderTranversal(){
        preorder(root);
    }

    private void preorder(Node node) {
        if(node == null){
            return;
        }
        System.out.printf("%d " , node.data);
        preorder(node.nodeKiri);
        preorder(node.nodeKanan);
    }
    
    public void inOrderTranversal(){
        inorder( root );
    }

    private void inorder(Node node) {
        if(node == null){
            return;
        }
        inorder(node.nodeKiri);
        System.out.printf("%d " , node.data);
        inorder(node.nodeKanan);
    }
    
    private void postOrderTranversal(){
        postorder(root);
    }

    private void postorder(Node node) {
      if(node == null){
          return;
      }
      postorder(node.nodeKiri);
      postorder(node.nodeKanan);
      System.out.printf("%d " , node.data);
    }
    
    public static void main(String[] args) {
        Tree tree = new Tree();
        int nilai;
        Random randomNumber = new Random();
        
        System.out.println("sisip nilai data berikut");
        for (int i = 1; i <= 10; i++) {
            nilai = randomNumber.nextInt(10);
            System.out.println( nilai + " ");
            tree.insertNode(nilai);
        }
//        System.out.println("insert nilai 1, 2, 3, 4, 5");
//        tree.insertNode(3);
//        tree.insertNode(5);
//        tree.insertNode(1);
//        tree.insertNode(2);
//        tree.insertNode(4);        
        
        System.out.println( "\n\nPreorder traversal" );
        tree.preOrderTranversal();
        
        System.out.println( "\n\nInorder traversal" );
        tree.inOrderTranversal();
        
        System.out.println( "\n\nPostorder traversal" );
        tree.postOrderTranversal();
        System.out.println("");
    }
    
    
    
}
