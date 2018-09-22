package strukturdata.AVLTree;

/**
 *
 * @author riskipradana
 */
public class MainProgram {
    public static void main(String[] args) {
        
        AVLTree tree = new AVLTree(); 
  
        tree.akar = tree.insert(tree.akar, 200); 
        tree.akar = tree.insert(tree.akar, 1); 
        tree.akar = tree.insert(tree.akar, 150); 
        tree.akar = tree.insert(tree.akar, 111154); 
        tree.akar = tree.insert(tree.akar, 55); 
  
        /* hasil dari AVL Tree program diatas adalah 
             150 
            /   \ 
           1    200 
            \     \ 
            55     11154 
         */ 
        System.out.println("Preorder"); 
        tree.preOrder(tree.akar); 
        System.out.println("\nInorder"); 
        tree.inOrder(tree.akar); 
    } 
}
