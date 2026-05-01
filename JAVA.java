import java.util.Scanner;

public class JAVA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("For Factorical enter '1': ");
        System.out.println("For checking the number is Even or Odd enter 2 : ");
        a = sc.nextInt();
        if (a == 1) {
            int n;
            System.out.println("Enter a number");
            n = sc.nextInt();
            System.out.println("The Answer is : " + factorical(n));
        } else if(a==2) {
            int n;
            System.out.println("Enter a number");
            n = sc.nextInt();
            System.out.println("The Answer is : " + evenodd(n));
        }
        else{
            System.out.println("Invalid input");
        }
    }

    public static int factorical(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static String evenodd(int n) {
    String a;
        if (n%2 == 0){
           return "Even";
        }
        else {
            return "Odd";
        }

    }
}