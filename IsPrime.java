public class IsPrime{   
public  static void    prime(){
  System.out.println(isPrime());
}

private static void    isPrime(){
    Scanner scan = new Scanner(System.in);
    System.out .println ("Please enter positive  number: ");
    int n=scan.nextInt();
    if(n<=0){
        System.out .println ("input error ");
        return;

    }
    for (int i=2 ;i<n ;i++){
        if(n%i == 0){
            System.out .println ("The number is not Prime");
            return;

        }

    }
    System.out .println ("The number is Prime");

}
}
