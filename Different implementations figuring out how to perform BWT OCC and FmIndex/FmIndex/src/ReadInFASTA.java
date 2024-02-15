import java.io.File;
import java.util.Scanner;

public class ReadInFASTA {
    private String file;
      private  String data;

//      public ReadInFASTA() {
//          this.data = data;
//      }
public int getLength(){
//    System.out.println();
    return data.length();
}
//public String getString(){
//    return data.toString();
//}
    public String read() throws Exception {
        File inputFile = new File("input.FASTA");
        Scanner ourFASTAFile = new Scanner(inputFile);
        ourFASTAFile.nextLine();
       String data = ourFASTAFile.nextLine();
//        System.out.println(data);
//        System.out.println(data.length());
        this.data = data;
        return (data + "$");

        // Below is an extension to read multiple strings from a custom input fasta file.
        //for the assignment, this is unnecessary and has been commented out. Implemented for practice.
//        Scanner input = new Scanner(System.in);
//        String file = input.nextLine();
//        System.out.println(file);
//        file += ".FASTA";
//        System.out.println(file);
//        File inputFile = new File(file);
//        Scanner ourFASTAFile = new Scanner(inputFile);
//        int count = 0;
//        while (true) {
//            try {
//                while (ourFASTAFile.hasNextLine()) {
//                    ourFASTAFile.nextLine();
//                    String data = ourFASTAFile.nextLine();
//                    System.out.println(data);
//                    return (data);
//                }
//                ourFASTAFile.close();
//            } catch (Exception e) {
//                System.out.println("File: " + file+ " not found, Try again.");
//                input = new Scanner(System.in);
//                file = input.nextLine();
//                System.out.println(file);
//                file += ".FASTA";
//                System.out.println(file);
//                inputFile = new File(file);
//                ourFASTAFile = new Scanner(inputFile);
//                if (count >=10)
//                throw new BadStringOperationException("File not found");
//            }
//        }
    }
}


