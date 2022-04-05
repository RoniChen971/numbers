public class EvevnOrOdd{
public static void evenOrOdd() {
        evenOdd();
    }

    private static void evenOdd() {
       final int ZERO =0 ;
        final int TWO =2 ;

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number ");
        num = scan.nextInt();
        if (num <ZERO )
            System.out.println("wrong number");
        else if (num% TWO==ZERO )
            System.out.println("The number is even");
        else             System.out.println("The number is odd");


    }
}
