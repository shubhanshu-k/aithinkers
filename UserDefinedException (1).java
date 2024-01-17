/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.BufferedReader;
import java.io.InputStreamReader;



public  class UserDefinedException
{

    public static void main(String[] args) throws Exception
    {
    int i=5;
    try {
    if(i<10){
     throw new MyException(" value should  be greater than 10");   
    }
    }
    catch (MyException e){
        System.out.println(e);
    }
}
}

// user defined exception//
 class MyException extends Exception {
    // constructor of our user defiend exception class //
    public MyException(String msg){
        
        // super keyword is used to invoke constructor //
        super(msg);
    }
    
    
}