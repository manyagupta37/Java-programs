package DSA3;

public class armstrong {
    public static void main(String[] args) {
        int a=153;
        int temp=a;        //store a becoz in below we are modyfying a
        int summ=0;
        while(a>0)
        {
            int rem=a%10;

            int cube=rem*rem*rem;
            summ+=cube;
            a=a/10;

        }
        if(summ==temp)
        {
            System.out.println("armstrong");
        }else {
            System.out.println("not armstrong");
        }


//range of armstrong numbers
        int n;
        for (int i=100;i<=1000;i++)
        {
            if(is_arm(i))
            {
                System.out.println(i);
            }
        }
    }
    public static boolean is_arm(int n)
    {

        int sum=0;
        int temp=n;
        while(n>0)
        {
            int r=n%10;
            int cube=r*r*r;
            sum+=cube;
            n=n/10;
        }
        if(sum==temp)
        {
            return true;
        }
        return false;
    }
}
