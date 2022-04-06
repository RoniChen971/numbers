public class SumDigits{ 
private static int  sumNumber(int n) {
        if (n<=9)
            return n;
        return n%10 +sumNumber(n/10);
    }
}
