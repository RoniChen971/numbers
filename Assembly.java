import java.util.Scanner;


public class Assembly{

   private static int  assembly(){
        Scanner scan = new Scanner(System.in);
        int result=1;
        System.out .println ("Please enter positive  number: ");
        int n=scan.nextInt();
        if(n<=0) {
            System.out.println("input error ");
            return -1;
        }
            for (int i=1 ;i<=n ;i++)
                result=result*i;
            return result;



    }}
