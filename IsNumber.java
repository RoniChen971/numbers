public class IsNumber{ 
public static void isNumber() {
        isNum();
    }

    private static void isNum() {
        final int SMALL_NUM = 10, MEDIUM_NUM = 100, BIG_NUM = 1000;
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number ");
        num = scan.nextInt();
        if (num < SMALL_NUM)
            System.out.println("small");
        else if (num < MEDIUM_NUM)
            System.out.println("middle");
        else if (num < BIG_NUM)
            System.out.println("big");
        else
            System.out.println("very big");

    }
}
