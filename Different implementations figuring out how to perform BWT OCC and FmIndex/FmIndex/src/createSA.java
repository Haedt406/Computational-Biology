import java.util.*;

public class createSA {
//    String[] arrayL;
//    int[] arrayR;

    public void create(DNASeq seq) {
        int seqLength = seq.getLength();
        TreeMap<String, Integer> SA = new TreeMap();
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
//        for (int i = 0; i < seqLength; i++) {
//            System.out.print("SA[" + i + "]" + SA[i]);
//        }

//        System.out.println(SA);
        Collection c = SA.values();
        Iterator itr = c.iterator();
//        System.out.println(c);

        for (int i = 0; i < seqLength+1; i++) {
            Arrays.sort(arrayL);
            System.out.print("SA[" + Math.addExact(i,1) + "]: " + Math.addExact((Integer) itr.next(), 1) + "  Value: " + arrayL[i].toString());
            System.out.println("");
        }
//        for (Map.Entry<String, Integer> i : SA.entrySet()) {
//            String value = String.valueOf(i.getValue());
//            Integer key = Integer.valueOf(i.getKey());
//            for (int j = 0; j < seqLength; j++) {
//            System.out.print("SA[" + i + "]" + "value: " + value + " Key: " + key);
//        }
//        }



//        for (int i = 0; i < seqLength; i++) {
//            System.out.print(arrayL[i]);
//            System.out.print(arrayR[i]);
//            System.out.println("");
//        }


//        String[] suffixes = new String[seqLength];
//        for (int i = 0; i < seqLength; i++) {
//            suffixes[i] = seq.data.substring(i, seqLength);
//        }
//        int[] suffArr = new int[seqLength];
//        for (int i = 0; i < seqLength; i++) {
//            suffArr[i] = seq.getString().indexOf(suffixes[i]);
//        }
//
//        System.out.println(Arrays.toString(suffArr));
    }
}
