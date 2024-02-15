import java.util.ArrayList;
import java.util.Arrays;

public class computeBWT {
    public computeBWT(String sequence) {
        String lastChar;
        StringBuilder BWT = new StringBuilder();
        StringBuilder sb;
        String[] unsortedBWT = new String[sequence.length()];
        ArrayList<String> sortedBWT = new ArrayList<>(sequence.length());
        for (int i = 0; i < sequence.length(); i++) {
            lastChar = sequence.substring(sequence.length() - 1);
            sb = new StringBuilder(sequence);
            if (i == 0) {
                unsortedBWT[i] = sequence;
            } else {
                sequence = lastChar + sb.substring(0, sequence.length() - 1);
                unsortedBWT[i] = sequence;
            }
        }
        System.out.println(Arrays.toString(unsortedBWT));
        System.out.println("String list unsortdBWT: " + Arrays.toString(unsortedBWT));
        Arrays.sort(unsortedBWT);
        sortedBWT.addAll(Arrays.asList(unsortedBWT).subList(0, sequence.length()));
        for (String BWTchar : sortedBWT) {
            BWT.append(BWTchar.substring(sequence.length() - 1));
        }
        System.out.println("sorted BWT Arraylist<String>: " + sortedBWT);
        System.out.println("final BWT: " + BWT);
    }
}