class Node
{
    Node next ;
    int data ;
}
class LinkList
{
  
    static Node head ;

    public static Node createNode(int val)
    {
        Node nn = new Node() ;
        nn.next = null ;
        nn.data = val ;
        return nn ;
    }
    
    public static void insert(int val)
    {
        Node nn = createNode(val) ;
        if(head == null)
        {
            head = nn ;
            return ;
        }
        Node temp = head ;
        while(temp.next != null)
        {
            temp = temp.next ;
        }
        temp.next = nn ;
    }
 
    public static void printList(Node head)
    {
        
        while(head != null)
        {
            System.out.println(head.data) ;
            head = head.next ;
        }
    } 
    public static void push(int val)
    {
        Node nn = createNode(val) ;
        nn.next = head ;
        head = nn ;
        
    }
    public static void main(String []args)
    {
        int [] a = {1, 2, 3, 4, 5, 6} ;
       
        for(int i = 0; i < 5; i++)
        {
            insert(a[i]) ;
        }
        System.out.println("List Elements after insertion") ;
        printList(head) ;
        push(a[5]) ;
        System.out.println("List Elements after push operation performed") ;
        printList(head) ;
    }
}       
