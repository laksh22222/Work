import java.util.Scanner;

public class decimaltobinary {
    public static void main (String[]  args) {

        Scanner sc = new Scanner(System.in);
        int a;
        do {
        System.out.println("Enter a number to Convert in binary: ");
        int num = sc.nextInt();
        int[] bit;
        bit = new int[32];
        int i =0;
        while (num>0) {

            bit[i] = num%2;

            i++;
             num =num/2;
        }
        for(int j=i-1;j>=0;j--) {
            System.out.print(bit[j]);
        }
            System.out.println();
            System.out.println("If you want to continue this enter '1'or want to end this enter any number:");
        a=sc.nextInt();
    }while(a==1);
        System.out.println("Thank you");

}}