import tree.newTree ;
class In_Pre_Tree
{
    static int idx = 0 ;
    static newTree node ;
    
    public newTree buildTree(int[] pre, int[] in, int s, int e) 
    {

         if(s > e)
         {
             return null ;
         }
         newTree node = new newTree(pre[idx++]) ;
         if(s == e)
         {
             return node ;
         }

         int inidx = search(in, s, e, node.key) ;
         node.left = buildTree(pre, in, s, inidx - 1) ;
         node.right = buildTree(pre, in, inidx + 1, e) ;
         return node ;
    }
    public int search(int[] in, int s, int e, int key)
    {
        for(int i = s; i <= e; i++)
        {
            if(in[i] == key)
            {
                return i ;
            }
        }
        return 0 ;
    }
    public static void main(String [] args)
    {
        In_Pre_Tree t = new In_Pre_Tree() ; 
        int []pre = new int[] {1, 2, 4, 5, 3, 7, 6, 8} ;
        int []in = new int[] {4, 2, 5, 1, 6, 7, 3, 8} ;
        node = t.buildTree(pre, in, 0, in.length - 1) ;
        node.printInorder(node) ;
     }
} 
