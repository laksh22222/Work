import java.util.Scanner;

public class arrayaddmulti {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    int c ,b;
        System.out.println("Enter the Rows:");
        c = sc.nextInt();
        System.out.println("Enter the Columns:");
        b = sc.nextInt();
        int[][] a = new int [c][b];
        int[][] r = new int [c][b];
        int[][] t = new int [c][b];
    System.out.println("Enter the number:");
    for (int i=0;i<c;i++){
        for (int j=0;j<b;j++) {
             a[i][j] =sc.nextInt();
        }
        }
    System.out.println("Enter the number:");
    for (int i=0;i<c;i++){
        for (int j=0;j<b;j++) {
              r[i][j] =sc.nextInt();
        }
                }
        System.out.println("For Addition enter '1' ");
        System.out.println("For Multiplication enter '2' ");
        int y=sc.nextInt();
    if(y==1) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < b; j++) {
                t[i][j] = a[i][j] + r[i][j];
            }
        }
        System.out.println("//========Addition========// ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("  " + t[i][j]);
            }
            System.out.println();
        }
    }
   else if (y==2){
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < b; j++) {
                t[i][j] = a[i][j] * r[j][i];
            }
        }
        System.out.println("//========Multiplication========// ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("  " + t[i][j]);
            }
            System.out.println();
        }
        }
   else
       System.out.println("Invalid number");
                }
                        }