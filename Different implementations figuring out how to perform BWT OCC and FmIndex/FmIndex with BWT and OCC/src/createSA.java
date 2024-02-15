import java.util.*;
public class createSA {
//tes
    public void create(DNASeq seq) {
        int seqLength = seq.getLength();
        TreeMap<String, Integer> SA = new TreeMap<>();
        String s = seq.getString();
        String[] arrayL = new String[seqLength+1];
        int[] arrayR = new int[seqLength+1];
        for (int i = 0; i < seqLength+1; i++) {
            arrayL[i] = s.substring(i);
            arrayR[i] = i;
        }
        for (int i = 0; i <= seqLength; i++) {
            SA.put(arrayL[i], arrayR[i]);
        }
        Collection<Integer> c = SA.values();
        Iterator<Integer> itr = c.iterator();
        for (int i = 0; i < seqLength+1; i++) {
            Arrays.sort(arrayL);
            System.out.print("SA[" + Math.addExact(i,1) + "]: " + Math.addExact(itr.next(), 1) + "  Value: " + arrayL[i]);
            System.out.println();
        }
    }
}
