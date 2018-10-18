import java.io.BufferedReader ;
import java.io.FileReader ;
import java.io.IOException ;

class SumOfFile
{
     public static void main(String [] args)
     {    
         FileReader f1 = null ;
         BufferedReader reader ;
         try
         {
              reader = new BufferedReader(new FileReader("n2File.txt")) ;
              String l = reader.readLine() ;
              int data ;
              int sum = 0 ;
              while(l != null)
              {
                  sum = sum + Integer.parseInt(l) ;
                  l = reader.readLine() ;
              }
              reader.close() ;
              System.out.println("sum = " + sum) ;
         }
         catch(Exception e){}
         finally
         {
             try
             {
                 f1.close() ;
             }
             catch(Exception e)
             {}
         }
      }
}


