
import java.util.*;

/**
 * @author Benjamin Haedt, Kelly Joyce
 */

public class Main {


    private static DNASeq singleSeq;

    public static void main(String[] args) throws Exception {
        int menuNumber = 1;
        Scanner console = new Scanner(System.in);

        while (menuNumber != 5) {                                                //our menu system for the paging table
            System.out.println("Enter 1 to load in a FASTA file");
            System.out.println("Enter 2 to create a suffix array from the loaded in DNA Sequence and print the array");
            System.out.println("Enter 3 to run Burrows–Wheeler Transform algorithm on the sequence, print out the 3D array and the output of the algorithm");
            System.out.println("Enter 4 to run the FM-Index on the BWT string");
            System.out.println("Enter 5 to exit");
            menuNumber = console.nextInt();
            ReadInFASTA sequence;
            int sequenceLength;
            createSA SA = null;
            DNASeq singleSeq = null;
            switch (menuNumber) {
                case 1 -> {
                    sequence = new ReadInFASTA();
                    sequence.read();
                    sequenceLength = sequence.getLength();
                    singleSeq = new DNASeq(sequence.read(), sequenceLength);
                    System.out.println(singleSeq.getLength());
                    sequence = null;
                    System.gc();
                    System.out.println(singleSeq.getString());
                    break;
                }
                case 2 -> {
                    if (singleSeq != null) {
                        System.out.println("hsdfsd");
                        SA.create(singleSeq);
//                        SA.print();
                    } else {
                        System.out.println("Please read a sequence from a FASTA file");
                    }
//
//                }
//                case 5 -> {
//                    menuNumber = 5;
//                }
//                default -> {
//                    break;
//                }
                }
            }
        }
    }
}
