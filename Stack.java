class StackNode
{
    StackNode next ;
    int data ;
    
}
class Stack
{
    static StackNode head = null ;
    static StackNode createNode()
    {
        StackNode nn = new StackNode() ;
        nn.next = null ;
        return nn ;
    }
    static void push(int val)
    {
        StackNode nn = createNode() ;
        nn.data = val ;
        if(head == null)
        {
             head = nn ;
             return ;
        }
        nn.next = head ;
        head = nn ;
    }
    static int pop()
    {
        int item = head.data ;
        head = head.next ;
 	return item ;
    }
    static int isEmpty()
    {
        if(head == null)
            return 1 ;
        else
            return 0 ;
    }
    public static void main(String[] args)
    {
        int [] a = {1, 2, 3, 4, 5, 6} ;
        int y = isEmpty() ;
        if(y == 1)
        {
            System.out.println("Stack is Empty") ;
        }
        else
            System.out.println("Stack have some elements") ;
        for(int i = 0; i < 6; i++)
        {
            System.out.println(a[i] + " Pushed") ;
	    push(a[i]) ;
        }
        y = isEmpty() ;
        if(y == 0)
        {
            System.out.println("Stack is not empty now") ;
        }
        else
            System.out.println("Stack still empty") ;
        for(int i = 0; i < 6; i++)
        {
            int x = pop() ;
            System.out.println(x + " Popped") ;
        }
        y = isEmpty() ;
        if(y == 0)
        {
            System.out.println("Stack is not empty") ;
        }
        else
            System.out.println("Stack is empty") ;
     }
 }    
     

