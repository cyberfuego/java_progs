import java.util.* ;

class trie_node
{
    boolean EndOfWord ;
    Map<Character, trie_node> m ;
    trie_node()
    {
        m = new HashMap<Character, trie_node>() ;
    }
}
class trie
{
    public static trie_node newNode()
    {
        trie_node t = new trie_node() ;
        t.EndOfWord = false ;
        return t ;
    }

    public static void insert(trie_node root, String s)
    {
        for(int i = 0; i < s.length(); i++)
        {
            if(!root.m.containsKey(s.charAt(i)))
            {
                root.m.put(s.charAt(i), newNode()) ;
            }
            root = root.m.get(s.charAt(i)) ;
        }
        root.EndOfWord = true;
    }
    
    public static int search(trie_node root, String s)
    {
        for(int i = 0; i < s.length(); i++)
        {
            if(!root.m.containsKey(s.charAt(i)))
            {
                return 0 ;
            }
            root  = root.m.get(s.charAt(i)) ;
        }
        if(root.EndOfWord == true)
        {
            return 1 ;
        }
        return 0 ;
    }
    
    public static void main(String [] args)
    {
        String[] s = new String[3] ;
        s[0] = "Ankush" ;
        s[1] = "Anku" ;
        s[2] = "Dutt" ;
        trie_node root = new trie_node() ;
        for(int i = 0; i < s.length; i++)
        {
            insert(root, s[i]) ;
        }
        assert(search(root, "Ankush") == 1) ;
        assert(search(root, "Anku") == 1) ;
        assert(search(root, "Ank") == 0) ; 
        System.out.println("All test cases passed") ;
    }
}
