package tree ;

public class newTree 
{ 
    public int key; 
    public newTree left, right; 
  
    public newTree(int item) 
    { 
        key = item; 
        left = right = null; 
    }
    public static void printInorder(newTree root)
    {
        
        if(root == null)
        {
            return ;
        }
        printInorder(root.left) ;
        System.out.print(root.key + " ") ;
        printInorder(root.right) ;
     }
   
         
}  
