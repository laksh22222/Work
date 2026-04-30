import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//
//        File myfile = new File("jeewani.txt");
//
//        try {
//            if (myfile.createNewFile()) {
//                System.out.println("File created successfully");
//            } else {
//                System.out.println("File already exists");
//            }
//        } catch (IOException e) {
//            System.out.println("File is not created");
//            e.printStackTrace();
//        }
//
//      File myfile = new File("laksh.txt");
//        try {
//      Scanner sc = new Scanner(myfile) ;
//        while(sc.hasNextLine()){
//         String line = sc.nextLine();
//         System.out.println(line);
//        }
//        sc.close();
//  }
//   catch ( IOException e){
//      e.printStackTrace();
//
//
//   }
//
//        try (FileWriter fileWriter = new FileWriter("laksh.txt")) {
//            fileWriter.write("This is new jgyjgyufgu jvfyufuofuv hufytfouyyof hcytdfytdtytoy ");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        File myfile = new File("jeewani.txt");
//        if (myfile.delete()){
//            System.out.println("File has been deleted "+myfile.getName());
//        }
//        else
//            System.out.println("Some error found while deleting ");
//
//    }
//}