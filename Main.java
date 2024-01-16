import java.util.*;

public class Main {
    public static void main(String[] args) {
      int i,j,k=0;
      int a[]= new int [4];
       i=8;
       j=2;
       
       try {
         k=i/j;
         for(int c=0;  c<=4; c++){
           a[c]=c+1;
         }
         
         for ( int value : a){
           System.out.println(value);
         }
       }
       
       catch (ArithmeticException e){
         System.out.println("cannot be divided by zero"+e);
  
       }
       
       catch (ArrayIndexOutOfBoundsException e){
         System.out.println("cant store more than 4 elements in the array "+e);
       }

        catch (Exception e){
         System.out.println("Unknown error"+e);
       }
        finally {
            System.out.println("finally block executed");
        }


        
}
}
