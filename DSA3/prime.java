package DSA3;

public class prime {
    public static void main(String[] args) {
        /*boolean ans = isPrime(8);
        System.out.println(ans);*/

        for (int i=2;i<=100;i++)
        {
            if (isPrime(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; //becoz 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}



