import java.util.Scanner;
public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {

            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int s = 0; s < i; s++) {
                System.out.print("* ");
            }

            System.out.println();
        }



        for (int i = n-1; i >= 1; i--) {

            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int s = 0; s < i; s++) {
                System.out.print("* ");
            }

            System.out.println();
        }





    }
}








































