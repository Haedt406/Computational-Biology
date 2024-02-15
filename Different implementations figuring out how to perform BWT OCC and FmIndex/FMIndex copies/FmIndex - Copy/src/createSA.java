import java.util.ArrayList;

public class createSA {
    String[] arrayL;
    ArrayList<Integer> suffixIndex;
    int suffixArray[];

    public void create(DNASeq seq) {
//        System.out.println(sequence.getLength());
        int seqLength = seq.getLength();
        arrayL = new String[seqLength];
        for (int i = 0; i < seqLength; i++) {
            arrayL[i] = seq.data;
        }
        System.out.println(arrayL);
//        suffixIndex = new ArrayList<Integer>();
//        suffixArray = new int[sequence.toString().length()];
//        for (int i = 0; i < sequence.toString().length(); i++) {
//            arrayL[i] = sequence.;
//        }
//        arr2 = arr1.clone();
//        Arrays.sort(arr1);
//        for (String i : arr1) {
//            String piece = i;
//            int index
//                    = new suffix_array().index(arr2, piece);
//            suffix_index.add(index);
//        }
//
//
//
//        public void print {
//            for (int i = 0; i < suffix_array.length; i++) {
//                suffix_array[i] = suffix_index.get(i);
//            }
//            System.out.println(
//                    "following is the suffix array for banana");
//            for (int i : suffix_array) {
//                System.out.print(i + " ");
//            }
//        }
    }
}
