
import java.util.*;
import java.util.stream.Stream;

/**
 * @author Benjamin Haedt, Kelly Joyce
 */

public class Main {


    private static DNASeq singleSeq;

    public static void main(String[] args) throws Exception {
//        Scanner console = new Scanner(System.in);
        ReadInFASTA sequence;
        int sequenceLength;
        DNASeq singleSeq;
        sequence = new ReadInFASTA();
        sequence.read();
        sequenceLength = sequence.getLength();
        singleSeq = new DNASeq(sequence.read(), sequenceLength);
//                    System.out.println(singleSeq.getLength());
        System.gc();
//                    System.out.println(singleSeq.getString());
        createSA sa = new createSA();
        sa.create(singleSeq);


        new computeBWT(sequence.read());
    }

//    private static void computeBWT(String sequence) {
//        String firstChar;
//        String lastChar;
////        String BWT = Arrays.toString(new String[sequence.length()]);
////        String unsortedBWT = "";
//        String BWT = "";
//        String l = "$";
//        StringBuffer sb;
//        String[] unsortedBWT = new String[sequence.length()];
//        ArrayList<String> sortedBWT = new ArrayList<>(sequence.length());
//
////        ArrayList<String> sortedBWT = new ArrayList<>();
////        System.out.println(unsortdBWT.toString());
//        for (int i = 0; i < sequence.length() ; i++) {
////                    String lastChar;
//            lastChar = sequence.substring(sequence.length() - 1);
////            System.out.println("lastChar: + "+lastChar);
//            sb = new StringBuffer(sequence);
//            if (i == 0) {
//
////                sequence = lastChar + sb.substring(0, sequence.length()-1);
////                System.out.println("SDFSDF" +sb.toString());
////                unsortdBWT.add(Arrays.toString(sequence.toCharArray()));
////                System.out.println("i = 0 sequence: " + sequence);
//
//
////                sequence = lastChar + sb.substring(1, sequence.length() );
//
//                unsortedBWT[i] = sequence;
//            }
//            else {
////                lastChar = sequence.substring(sequence.length() - 1);
//
//                sequence = lastChar + sb.toString().substring(0, sequence.length() - 1);
//                unsortedBWT[i] = sequence;
////                System.out.println(unsortdBWT[i]);
//
////                unsortdBWT.add(sequence);
//            }
////            System.out.println("current sequence: " + sequence);
////            System.out.println("unsorted array in for loop: " + unsortedBWT.toString());
//
//
////            unsortedBWT.
////            System.out.println(" Unsorted BWT " + unsortedBWT.charAt(i));
//        }
//        System.out.println(Arrays.toString(unsortedBWT));
//
//        System.out.println("String list unsortdBWT: " +Arrays.toString(unsortedBWT));
//        Arrays.sort(unsortedBWT);
////        sortedBWT= unsortedBWT;
////        char[] BWT = sequence.length();
//        for (int i = 0; i < sequence.length(); i++) {
//            lastChar = sequence.substring(sequence.length() - 1);
//            List<String> list = new ArrayList<>();
//            sortedBWT.add(unsortedBWT[i]);
////            sortedBWT.set(i+1, unsortedBWT[i+1]);
//
////            BWT[i] = list.toArray();
////         sb = new StringBuffer(unsortedBWT.toString().substring(i));
////            System.out.println(" Unsorted BWT " + Arrays.toString(unsortedBWT));
//
////            unsortedBWT[i] = unsortedBWT.substring(0, sequence.length() - 1)
////        char lastCharacter;
////////        char[] unsortedBWT = sequence.toCharArray();
//        }
//        for (String BWTchar : sortedBWT) {
//            BWT += BWTchar.substring(sequence.length()-1);
//        }
//        System.out.println("sorted BWT Arraylist<String>: " + sortedBWT);
//        System.out.println("final BWT: " + BWT);
//
////        for (int i = 0; i < sequence.length()-1; i++) {
////            System.out.println("in for loop: iteratoin and current unsortdBWT: " +i + " " +  unsortdBWT.toString());
////            firstChar = sequence.substring(0, 1);
//////            char [] unsortedBWT = unsortdBWT.get(unsortdBWT.su).toCharArray();
//////            BWT += unsortdBWT.get(Integer.parseInt(unsortdBWT.get(i).substring(0, sequence.length() - 1)));
////            firstChar = unsortdBWT.get(sequence.length() - 1);
////            System.out.println(("unsorted part: " + firstChar));
////             lastCharacter = firstChar.charAt(unsortdBWT.indexOf(i));
//////            unsortedBWT += lastCharacter;
//////            unsortedBWT = Stream.of(unsortedBWT).toString();
//////            System.out.println(("unsorted part: " + unsortedBWT));
//////            java.util.Arrays.sort(unsortedBWT);
//////             BWT = new String(unsortedBWT);
//////            String last = unsortdBWT.get(unsortdBWT.size()-1);
//////            BWT += unsortdBWT.get(last-1);
////
////        }
//
////        System.out.println("sorted unsortdBWT: " + unsortdBWT);
////
////        System.out.println("  " + BWT);
//    }
}

