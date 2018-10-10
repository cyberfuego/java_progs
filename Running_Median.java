import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Running_Median {
   public static  void addNumber(int n, PriorityQueue<Integer>max, PriorityQueue<Integer>min) 
   {
       if(min.size() == 0 || n > min.peek() )
       {
           min.add(n) ;
       }
       else
       {
           max.add(n) ;
       }
   }
   public static void balance(PriorityQueue<Integer>min, PriorityQueue<Integer>max)
   {
       PriorityQueue<Integer> s = min.size() < max.size() ? min : max ;
       PriorityQueue<Integer> l = min.size() > max.size() ? min : max ;
       if(l.size() - s.size() == 2)
       {
           s.add(l.poll()) ;
       }
      
   }
    


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder()) ;
        PriorityQueue<Integer> min = new PriorityQueue<Integer>() ;
        
        int count = 0, count1 = 0 ;
        int n = scanner.nextInt();
       

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            float median ;
            int aItem = scanner.nextInt();
            a[i] = aItem;
            addNumber(a[i],max,min) ;
            balance(min, max) ;
            if(min.size() == max.size())
            {
               median = ((float)(min.peek() + max.peek()))/2 ;
            }
            else
                median = min.size()>max.size() ? min.peek() : max.peek() ;
            System.out.println(median) ;
        }

        scanner.close();
    }
}

