import tree.newTree ;

class In_Post_Tree
{
    static newTree root ;
    static int idx  ;

    public newTree makeInPost(int[] in, int[] post, int st, int end)
    {
        if(st > end)
   	{
	    return null ;
 	}

        newTree root = new newTree(post[idx]) ;
        idx-- ;
        

        if(st == end)
        {
            return root ;
	}
        
        int i = search(in, st, end, root.key) ;
        root.right = makeInPost(in, post, i + 1, end) ;
        root.left = makeInPost(in, post, st, i - 1) ;
        return root ;
    }
  
    int search(int[] in, int st, int end, int value)
    {
        for(int i = 0; i < in.length; i++)
        {
            if(in[i] == value)
	    {
 		return i ;
            }
        }
        return -1 ;
    }
          
    
    public static void main(String []args)
    {
        In_Post_Tree p = new In_Post_Tree() ;
        int[] in = new int[]{4, 8, 2, 5, 1, 6, 3, 7} ;
        int[] post = new int[]{8, 4, 5, 2, 6, 7, 3, 1} ;
        idx = in.length - 1 ;
        root = p.makeInPost(in, post, 0, in.length - 1) ;
        if(root == null)
        {
            System.out.println("hello:") ;
        }
        root.printInorder(root) ;
     }
}
