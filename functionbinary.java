import java.util.Scanner;

public class functionbinary {

    public static void main (String[]  args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number to Convert in binary: ");
        int num = sc.nextInt();
        String f = binary(num);
        System.out.println("Binary: "+f);
}
public static String binary(int num ) {
 String f ="";
    int[] bit, a;
    bit = new int[32];
    int i = 0;
    while (num > 0) {
        bit[i] = num % 2;
        i++;
        num = num / 2;
    }
    for (int j = i - 1; j >= 0; j--) {
     f = f+bit[j];


    }
    return f;
}
}