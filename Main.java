import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number for factorical ");
        double a= sc.nextInt();

        double fact = 1;

        for( int i=1;i<= a;i++){
            fact=fact*i;
        }

        System.out.println(fact);

    }
}