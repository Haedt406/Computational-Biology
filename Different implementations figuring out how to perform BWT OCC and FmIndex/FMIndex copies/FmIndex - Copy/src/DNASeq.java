public class DNASeq {
    private final int length;
    public String data;
    public DNASeq(String string, int length) {
        this.data = string;
        this.length = length;
    }
    public int getLength(){
//    System.out.println(data.length());
//        System.out.println(length);
        return length;
    }
    public String getString(){
//        System.out.println(data.toString());
//        System.out.println(data);
        return data;
    }
}
