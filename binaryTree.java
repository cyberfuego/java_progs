import tree.newTree ;
class binaryTree 
{ 
    // Root of Binary Tree 
    newTree root; 
  
    binaryTree() 
    { 
        root = null; 
    } 
  
    
    void printPostorder(newTree node) 
    { 
        if (node == null) 
            return; 
  
     
        printPostorder(node.left); 
  
     
        printPostorder(node.right); 
  
        // now deal with the node 
        System.out.print(node.key + " "); 
    } 
  
    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(newTree node) 
    { 
        if (node == null) 
            return; 
  
        /* first recur on left child */
        printInorder(node.left); 
  
        /* then print the data of node */
        System.out.print(node.key + " "); 
  
        /* now recur on right child */
        printInorder(node.right); 
    } 
  
    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(newTree node) 
    { 
        if (node == null) 
            return; 
  
        /* first print data of node */
        System.out.print(node.key + " "); 
  
        /* then recur on left sutree */
        printPreorder(node.left); 
  
        /* now recur on right subtree */
        printPreorder(node.right); 
    } 
  
     
    void printPostorder()  {     printPostorder(root);  } 
    void printInorder()    {     printInorder(root);   } 
    void printPreorder()   {     printPreorder(root);  } 
  
    
    public static void main(String[] args) 
    { 
        binaryTree tree = new binaryTree(); 
        tree.root = new newTree(1); 
        tree.root.left = new newTree(2); 
        tree.root.right = new newTree(3); 
        tree.root.left.left = new newTree(4); 
        tree.root.left.right = new newTree(5); 
  
        System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreorder(); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostorder(); 
    } 
} 
