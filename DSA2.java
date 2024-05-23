import java.util.Scanner;
public class DSA2 {
    public static void main(String[] args) {
        /*for (int i=1;i<=5;i+=2)
        {
            System.out.println(i);
        }*/

// finding maximum number
        /*int a=10;
        int b=20;
        int c=30;
        if (a>b && a>c)
        {
            System.out.println("a is max");
        }
        else if(b>a && b>c){
            System.out.println("b is max");
        }
        else {
            System.out.println("c is max");
        }*/

        /*int a=10;
        int b=20;
        int c=30;
        int max=a;
        if (b>max)
        {
            max=b;

        }
        if(c>max) {
            max=c;

        }
        System.out.println(max);*/

// case check

       /* Scanner sc=new Scanner (System.in);

        char ch=sc.next().trim().charAt(1);
        if (ch>='a'&& ch<='z') {
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase");
            }
        }*/
/*
//fibonacci number
        int n=6;
        Scanner sc=new Scanner (System.in);
        int f1=0;
        int f2=1;
        for (int i=2;i<=n;i++)
        {
            int f3=f1+f2;
            f1=f2;
            f2=f3;

        }
        System.out.println(f2);

//occurence of number

        int num=1385757879;
        int count =0;
        while(num>0)
        {
            int rem=num%10;
            if (rem==7)
            {
                count++;
            }
            num=num/10;
        }
        System.out.println(count);

//reverse a number
        int num1=23597;
        int res=0;
        while(num1>0)
        {
            int rem=num1%10;
           num1=num1/10;
           res=res*10+rem;
        }
        System.out.println(res);
    */
// calculator
        System.out.println("enter the operator");
        Scanner sc =new Scanner(System.in);
        char op=sc.next().trim().charAt(0);
        System.out.println("enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=0;
        if (op=='+' || op=='-' || op=='*' || op=='/')
        {
            if (op=='+')
            {
                ans=a+b;
            }
            if (op=='-')
            {
                ans=a-b;
            }
            if (op=='*')
            {
                ans=a*b;
            }
            if (op=='/') {
                ans = a / b;
            }

        }
        else if(op=='x'||op=='X')
        {
            return;
        }
        else {
            System.out.println("invalid operator");
        }
        System.out.println(ans);

    }
}

