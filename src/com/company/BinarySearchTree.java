package com.company;

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    //insert new
    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {

    Node root;

    void insert(int value){
        root = insertRec(root, value);
    }

    public Node insertRec(Node root, int value){

        if(root == null){
            root = new Node(value);
            return root;
        }

        if(value < root.value){

            root.left = insertRec(root.left, value);

        }else if(value > root.value){

            root.right = insertRec(root.right, value);

        }
        return root;
    }

    public void inOrder(){

        inOrderRec(root);

    }

    public void inOrderRec(Node root){

        if(root != null){
            inOrderRec(root.left);
            System.out.println(root.value);
            inOrderRec(root.right);
        }

    }

    public static boolean contains(Node root, int value) {

        if(root != null){
            if(root.value == value){
                return true;
            }else if(contains(root.left, value)){
                return true;
            }else if(contains(root.right, value)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {


        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inOrder();

//        Node n1 = new Node(1, null, null);
//        Node n3 = new Node(3, null, null);
//        Node n2 = new Node(2, n1, n3);
//
//        System.out.println(contains(n2, 5));
    }
}