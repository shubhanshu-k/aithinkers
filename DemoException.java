import java.util.*;

public class DemoException {
    public static void main(String[] args) {
      int i,j,k=0;
      i=8;
      j=0; // these are normal statements 
      
       try { // statements with critical section of code //
         k=i/j;
       }
       catch (Exception e){
        // System.out.println(e);
        // it will print // ->
        // java.lang.ArithmeticException: / by zero
        
        
         System.out.println("cannot divide by Zero");
        
        
       }
      
      // System.out.println(k);
      // it will print 0//
      
  }
}