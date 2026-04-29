import java.util.Scanner;

import java.util.Scanner;

public class fl {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a floating point number:");
        String num = sc.nextLine();


        String [] a= num.split("\\.");

        if (a.length==2){
            System.out.println("Before part of decimal "+a[0]);
            System.out.println("After part of decimal "+a[1]);
        }
        else
            System.out.println("Invalid input");







    }
}