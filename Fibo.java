 

import java.util.Scanner;

public class Fibo{
public static int fibo{
  System.out .println ("Please enter positive  number: ");
         Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();  
return fibo( n);
}
private static int  fibo(int n) {
        if (n<=1)
            return n;
        return fibo(n-1)+ fibo(n-2);
    }
}
