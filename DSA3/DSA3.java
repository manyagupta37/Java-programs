package DSA3;
import java.util.Scanner;
public class DSA3{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter emp id:");
        int id=sc.nextInt();
        System.out.println("enter department:");
        String dep=sc.nextLine();
        switch(id){
            case 1-> System.out.println("manya");
            case 2-> System.out.println("swati");
            case 3 -> {
                System.out.println("stuti");
                switch(dep){
                    case "cse"-> System.out.println("cse");
                    case "aiml"-> System.out.println("aiml");
                    case "bca"-> System.out.println("bca");
                    default-> System.out.println("invalid");
                }
            }
        }
    }
}
