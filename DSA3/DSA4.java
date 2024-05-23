package DSA3;
import java.util.Arrays;
import java.util.Scanner;
public class DSA4 {
    /*public static void main(String[] args) {
         String ans = func();
         System.out.println(ans);
         int ans1 = sum(78, 56);
         System.out.println(ans1);
         String name = "manya";
         System.out.println(greet(name));

         int s=89;
         int d=90;
         swap(s,d);

     }

     public static String func() {
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         return s;
     }

     public static int sum(int a, int b) {
         int sum = a + b;
         return sum;
     }

     public static String greet(String names) {
         return("hello" + names);
     }

     public static void swap(int n1,int n2)
     {
         int temp=n1;
         n1=n2;
         n2=temp;
         System.out.println(n1);
         System.out.println(n2);
     }

//scoping
    /*public static void main(String[] args) {
        int a = 90;
        int b = 78;
        {
            a=100;
            System.out.println(a);
            int c = 67;

        }
        System.out.println(a);

    }

    static int a=78;

    public static void main(String[] args) {
        System.out.println(a);
        int a=190;
        System.out.println(a);  //overriding higher scope
        func();
    }
    public static void func()
    {
        System.out.println(a);
    }



//variable length arguments
public static void main(String[] args) {
    sum(1,2,3,4,5);
    details(10,20,"manya","swati","stuti");
}
public static void sum(int ...num)
{
    int sum=0;
    for (int i=0;i<=num.length;i++)
    {
        sum+=i;

    }
    System.out.println(sum);
}
public static void details(int a, int b, String ...names)
{
    System.out.println(a);
    System.out.println(b);
    System.out.println(Arrays.toString(names));
}
*/

//overloading
public static void main(String[] args) {
fun();
fun(10);
fun(78,49.0f);
}
public static void fun()
{
    System.out.println("my name is manya");
}
public static void fun(int a)
{
    System.out.println(a);
}
public static void fun(int b, float c)
{
    System.out.println(b);
    System.out.println(c);
}
}

