import java.io.IOException ;
import java.io.FileReader ;
import java.io.FileWriter ;

class FileHandling
{
   public static void main(String []args)
   {
        String str = "Hello-Moto" ;
        FileWriter f = null ;
        try
	{
	    f = new FileWriter("nfile.txt") ;
            f.write(133) ;
            f.write(str) ;
            for(int i = 0; i < str.length(); i++)
            {
                f.write(str.charAt(i)) ;
            }
         }
         catch(Exception e)
	 { }
 	 finally
	 {
	     try
	     {
		f.close() ;
	     }
             catch(Exception e)
             {
                 System.out.println("File did not opened") ;
             }
         }
         FileReader f1 = null ;
         try
         {
             f1 = new FileReader("nfile.txt") ;
             
             System.out.print((char)(f1.read())) ; // Unicode value 
             System.out.print(f1.read()) ;//Unicode value in Decimal represenation
             int data ;
              while((data = f1.read()) != -1)
              {
 		  System.out.print((char)data) ;
              }
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
         
            
