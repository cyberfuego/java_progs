import tree.newTree ;
import java.util.* ;
class level_order
{
    newTree root ;

    level_order()
    {
        root = null ;
    }
    
    void printEach(newTree root)
    {
        Queue<newTree>q = new LinkedList<newTree>() ;
        System.out.println("level order:") ;
        q.add(root) ;
        while(!q.isEmpty())
        {
            newTree temp = q.poll() ;
            System.out.print(temp.key + " ") ;
            if(temp.left != null)
            {
                q.add(temp.left) ;
            }
            if(temp.right != null)
            {
                q.add(temp.right) ;
            }
        }
    }
            
    void printLevel()
    {
        printEach(root) ;
    }
    public static void main(String [] args)
    {
        level_order l = new level_order() ;
        l.root = new newTree(1) ;
        l.root.left = new newTree(2) ;
        l.root.right = new newTree(3) ;
        l.root.left.left = new newTree(4) ;
        l.root.left.right = new newTree(5) ;
        l.printLevel() ;
    } 
}    
