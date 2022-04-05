import java.util.Scanner;


public class ChangesNumber {
    public static void changesNumber() {
        ChangesNum();
    }


    private static void ChangesNum() {

        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number ");
        num = scan.nextInt();
        if(num==1 || num==2)
            num+=  1;
         else if(num<= 5 && num>=3)
            num-= 1;
            else if(num==6)
                num*= 2;
            else
            num*= 3;


        System.out.println("The new number is:  " + num);


    }
}
