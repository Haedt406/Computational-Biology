import java.io.File;
import java.util.Scanner;

public class ReadInFASTA {
      private  String data;
public int getLength(){
    return data.length();
}
    public String read() throws Exception {
        File inputFile = new File("input.FASTA");
        Scanner ourFASTAFile = new Scanner(inputFile);
        ourFASTAFile.nextLine();
       String data = ourFASTAFile.nextLine();
        this.data = data;
        return (data + "$");
    }
}


