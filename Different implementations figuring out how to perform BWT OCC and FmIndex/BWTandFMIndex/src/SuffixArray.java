public class SuffixArray {

    public String text;
    private int[] position;


    public SuffixArray(String text) {
        this.text = text;
    }

    public void add(int position) {
        this.position = new int[]{position};
    }
    public String getString() {
        return text;
    }
    public void addNum(int position) {
        this.position = new int[]{position};
    }
    public int[] returnNum() {
        return this.position;
    }
    public void print() {
        for (int i = 0; i < this.text.length(); i++){
        System.out.print(Integer.parseUnsignedInt(String.valueOf(i)));
        }
    }

}