
/**
 * @author Benjamin Haedt, Kelly Joyce
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    //    public static suffixArray[] SA;

    //
//    interface suffixArray {
//    }
//
//    class data implements suffixArray {
//    }
//
//    class position implements suffixArray {
//    }
    public static String data;

    public static void main(String[] args) throws FileNotFoundException {
//        ArrayList<Object> SA = new ArrayList<>();

//        List SA = new ArrayList();
        File inputFile = new File("input.FASTA");
        Scanner file = new Scanner(inputFile);
        file.nextLine();
        data = file.nextLine();
//        System.out.println(data);
        data += "$";
        int dataLength = data.length();
//        Suffix suffixes[] = new Suffix[data.length()];
        String[] array1 = new String[dataLength];
        int[] arrayInt = new int[dataLength];
        String array2[] = new String[dataLength];
        ArrayList<Integer> suffixIndex = new ArrayList<Integer>(dataLength);
        SuffixArray SA = new SuffixArray(data);
//        ArrayList<Integer> suffixArray = new ArrayList<Integer>(dataLength);
//        suffixArray SA = new suffixArray(data.length());
        for (int i = 0; i < dataLength; i++) {
            array1[i] = data.substring(i);
            arrayInt[i] = i;
            System.out.println(arrayInt[i]);
//            System.out.println(arrayInt[i] + arrayL[i]);
        }
//        int suffixTree = new suffix().index(arr2, piece);
//        suffix_index.add(index);
        array2 = array1.clone();
        Arrays.sort(array1);
        for (int i = 0; i < data.length(); i++) {
//            suffixIndex.add(arrayInt[i]);
            SA.addNum(arrayInt[i]);
//            suffixIndex.add(array2[i].indexOf(i), arrayInt[i]);
//            System.out.println(suffixIndex);
//            System.out.println(suffixIndex.get(i));
        }
        for (int it : arrayInt) {
//            suffixIndex.add(arrayInt[Integer.parseInt(i)]);
            SA.addNum(it);
//            suffixIndex.add(array2[i].indexOf(i), arrayInt[i]);
//            System.out.println(suffixArray.get(Integer.parseInt(i)));
//            System.out.println(suffixIndex.get(i));
        }
        SA.print();

//        for (int i = 0; i < data.length(); i++) {
//            suffixArray.add(array1[i]);
////            suffixIndex.add(array2[i].indexOf(i), arrayInt[i]);
//            System.out.println(suffixArray.get(i));
////            System.out.println(suffixIndex.get(i));
//        }


//        for (String word : array1) {
//            System.out.println(array2[Integer.parseInt(word)].toString());
//        }
//        StringBuilder sb = new StringBuilder(data);
//        String[] suffixes = new String[data.length()];
//        for (int i = 0; i < data.length(); i++) {
//            suffixes[i] = sb.substring(i, data.length());
//        }
//        System.out.println(suffixes.toString());
//    }

//        System.out.println(Arrays.toString(arrayL));
//        for (int i = 0; i < data.length()+1; i++) {
//            SA.add((arrayL[i]));
//        }
//        for (int i = 0; i < data.length()+1; i++) {
//            System.out.println(SA);
//        }
//        for (int i = 0; i < data.length()+1; i++) {
//            suffixArray[i] = arrayInt[Arrays.asList(arrayInt).indexOf(i)];
//            System.out.println(suffixArray[i]);
//
//        }
//        SA = new suffixArray();
//        for (int i = 0; i < data.length()+1; i++) {
//            SA.add(arrayL[i], arrayInt[i]);
//            System.out.println(SA.getIndex() + SA.getString());
//            suffixIndex[i] = SA.getIndex();
//        }
//        System.out.println(suffixIndex);
//        singleSeq = new DNASeq(sequence.read(), sequenceLength);
////                    System.out.println(singleSeq.getLength());
//        System.gc();
////                    System.out.println(singleSeq.getString());
//        createSA sa = new createSA();
//        sa.create(singleSeq);
        }
    }
