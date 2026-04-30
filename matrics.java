import java.util.Scanner;
public class matrics {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b,c;
        int[][] a ;

        a = new int [10][10];
        System.out.println("Enter the rows:");
        b=sc.nextInt();
        System.out.println("Enter the columns:");
        c=sc.nextInt();
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {

                a[i][j]=sc.nextInt();
            }

        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
               System.out.print("   "+a[i][j]);

            }
            System.out.println();
        }

    }
}