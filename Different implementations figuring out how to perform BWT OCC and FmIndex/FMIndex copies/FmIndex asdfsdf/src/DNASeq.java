public class DNASeq {
    private final int length;
    public String data;
    public DNASeq(String string, int length) {
        this.data = string;
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public String getString(){
        return data;
    }
}
