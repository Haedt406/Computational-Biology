import java.util.Scanner;

/**
 * @author Benjamin Haedt
 */


public class Main {

    public static void main(String... args) throws Exception {
        ReadInFASTA sequence;
        int sequenceLength;
        DNASeq singleSeq;
        sequence = new ReadInFASTA();
        sequence.read();
        sequenceLength = sequence.getLength();
        singleSeq = new DNASeq(sequence.read(), sequenceLength);
        System.gc();
//        createSA sa = new createSA();
//        sa.create(singleSeq);
//        new computeBWT(sequence.read());
        FmIndex fmIndex = new FmIndex();
        fmIndex.computeSA(singleSeq);
        fmIndex.computeBWT(sequence.read());
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

    }
}

