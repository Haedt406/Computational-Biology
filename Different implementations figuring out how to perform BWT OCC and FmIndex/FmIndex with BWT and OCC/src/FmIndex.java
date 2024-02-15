import java.awt.*;
import java.util.*;

import static java.awt.SystemColor.text;
import static java.util.Collections.*;


public class FmIndex {
    String[] arrayL;
    int[] arrayR;
    String text1;

    public void computeSA(DNASeq seq) {
        int seqLength = seq.getLength();
        TreeMap<String, Integer> SA = new TreeMap<>();
        String s = seq.getString();
        arrayL = new String[seqLength + 1];
        arrayR = new int[seqLength + 1];
        for (int i = 0; i < seqLength + 1; i++) {
            arrayL[i] = s.substring(i);
            arrayR[i] = i;
        }
        for (int i = 0; i <= seqLength; i++) {
            SA.put(arrayL[i], arrayR[i]);
        }
        Collection<Integer> c = SA.values();
        Iterator<Integer> itr = c.iterator();
        for (int i = 0; i < seqLength + 1; i++) {
            Arrays.sort(arrayL);
            System.out.print("SA[" + Math.addExact(i, 1) + "]: " + Math.addExact(itr.next(), 1) + "  Value: " + arrayL[i]);
            System.out.println();
        }
    }

    public void computeBWT(String sequence) {

        String lastChar = null;
        StringBuilder F = new StringBuilder();
        StringBuilder L = new StringBuilder();
        StringBuilder sb;
        String[] unsortedBWT = new String[sequence.length()];

//        StringBuilder C = new StringBuilder();

//        String[] C = new String[];
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
        Arrays.sort(unsortedBWT);

        sortedBWT.addAll(Arrays.asList(unsortedBWT).subList(0, sequence.length()));
        for (String BWTchar : sortedBWT) {
            L.append(BWTchar.substring(sequence.length() - 1));
        }
        for (String BWTchar : sortedBWT) {
            F.append(BWTchar.charAt(0));
        }

//        System.out.println("sorted BWT Arraylist<String>: " + sortedBWT);
        System.out.println("last column of BWT: " + F);
        System.out.println("First column of BWT: " + L);
//        Map<Character,Integer> charFreq = new HashMap<Character,Integer>();


        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : sequence.toCharArray()) {
            set.add(c);
        }
//        System.out.println("set: " +set);


//        JTable table = new JTable (2, 2);
        ArrayList<Character> array = new ArrayList<>(set);

        sort(array);
        System.out.println("set: " + array);

        int[] C = new int[array.size()];

        int countBefore = 0;
        char test = '$';
        char currentChar;

        Character[] charArray = new Character[set.size()];
        Integer[] intSize = new Integer[set.size()];

        for (int i = 0; i < set.size(); i++) {
            charArray[i] = array.get(i);
            System.out.print("  Char Array " + charArray[i]);
        }
        OUT:
        for (int i = 0; i < set.size(); i++) {
            if (i == 0){
                C[i] = 0;
                i++;
            }
            test = charArray[i];
            while (i < set.size() && charArray[i].charValue() == test) {
                countBefore++;
//                test = charArray[i];
                if (test != F.charAt(i)) {
                    C[i] = countBefore;
                }
                if(F.charAt(i) == F.length()){
                    break OUT;
                }
            }
        }
        for (int i = 0; i < set.size(); i++) {
            System.out.println("Occ[ %c, %d]: " + charArray[i] + C[countBefore]);
        }
//                System.out.println(Arrays.toString(charArray));
//        for(int i = 0; i < F.length(); i++){
//            OccTable.add(new Occ(test, countBefore));
//            try{
//                OccTable.add(new Occ(charArray[i], countBefore));
//
//            } catch (Exception e) {
//                 break;
//            }
//            while (charArray[i] == test){
//                test = charArray[i];
//                i++;
//                countBefore++;
//                OccTable.add(new Occ(test, countBefore));
//            }
//        }
//        for(int i = 0; i < set.size(); i++){
//            charArray[i] = array.get(i);
//        }
//        Character last = '$';
//        OccTable.stream().map(Occ::getLength).forEach(System.out::println);
//        System.out.println(Arrays.toString(OccTable.toArray()));
//
//
//        for(int i = 0; i < set.size(); i++){
////            System.out.println(OccTable.get(i));
//
////            OccTable insert = new Occ(test, countBefore);
////            OccTable.add(insert);
////            OccTable.get(i);
////            System.out.println(test);
////            System.out.println(Arrays.toString(charArray));
////            if(last == '$'){
////                OccTable.add(new Occ(last, i));
////            }
//            while (charArray[i] == test && Arrays.stream(charArray).count() < set.size()){
//                last = charArray[i];
//
//                countBefore++;
//                i++;
//
//            }
//            count++;
//            test = charArray[count];
//            OccTable.add(new Occ(last, countBefore));
//
//
//        }
//        System.out.println(Arrays.toString(OccTable.toString().toCharArray()));


//        System.out.println(Arrays.toString(new ArrayList[]{OccTable}));

//            while(currentChar == currentChar){
//                currentChar[array.get(i)] = currentChar[array.get(1+i)];
//            }


//        charArray.clone(array.toArray());

//        for (Character n : charArray) {
//            charArray[n] = array.get(n);
//        }
//                .forEach(n -> charArray[n] = randomCharacter());
//        Map<Character, Long> charCountMap = new HashMap<>();
//        for (Character c : charArray) {
//            charCountMap.merge(c, 1L, Long::sum);
//        }
//        for(int i = 0; i < F.length(); i++){
//            currentChar = array.get(charArray[i]);
//            System.out.println(currentChar);
////            while(currentChar == currentChar){
////                currentChar[array.get(i)] = currentChar[array.get(1+i)];
////            }
//
//        }
//        String[] C = new String[set.size()];
//        for(int i = 0; i < F.length(); i++){
//
//            if(array.get(i) == '$'){
//                int temp = asdf[1];
//                asdf[1] = 0;
//                asdf[set.size()] = temp;
////               OccTable.add(new Occ(test,countBefore));
//               test = array.get(count);
//               count++;
//                countBefore++;
//                System.out.println("asdf: " + asdf[i]);
//                System.out.println("char: " + test);
////                System.out.println("occ table: " +OccTable.get(i).toString());
//
//            }
//            else if (test != '$'){
//                while (test != test) {
//
////                    System.out.println(test);
//                    countBefore++;
//                F.charAt(i+1);
////                    OccTable.add(new Occ(test,i));
//                }
//                test = array.get(count);
//                asdf[i] = countBefore;
////                System.out.println("char: " + test);
////                System.out.println("asdf: " + asdf[i]);
//                countBefore++;
////                System.out.println(OccTable.get(i).toString());
//            }
//            count++;
//
//        }
//        System.out.println(OccTable);


//
//        String currentChar = "$";
//        int count = 0;
//        int charValue = currentChar.charAt(0);
//        String next = String.valueOf( (char) (charValue + 1));

//        for (int i = 0; i < F.length(); i++) {
//            char currentChar = F.charAt(i);
//            if(charFreq.containsKey(currentChar)) {
//                charFreq.put(currentChar,charFreq.get(currentChar)+1);
//            }else{
//                charFreq.put(currentChar,1);
//            }
//        }
//        System.out.println(charFreq);


//        int size = 0;
//        int total = 0;
//        Collection<Integer> listOfValues = charFreq.values();
//        for (Integer oneList : listOfValues) {
//            total += oneList.intValue();
//        }
//        for (int i = 0; i < total; i++) {
//            char currentChar = F.charAt(i);
//            if(charFreq.containsKey(currentChar)) {
//                charFreq.put(currentChar,charFreq.get(currentChar)+1);
//            }else{
//                charFreq.put(currentChar,1);
//            }
//        }
//        System.out.println(total);

//        System.out.println(charFreq);
//        System.out.println(charFreq);
//        for (int i = 0; i < L.length(); i++) {
//                if(L.charAt(i)  )
//                int newCount = (count==null ? 1 : count+1);
//                charFreq.put(c, newCount);
//            }

//        String[] C = new String[getCharFreq(String.valueOf(L)).size()];

    }
}