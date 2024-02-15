public class suffix {
    private final int length;
    public int index;
    public String data;

    public suffix(int length) {
        this.length=length;
    }

    public String getString() {
        return data;
    }

    public int getIndex() {
        return index;
    }

//    public void addString(String data) {
//        this.data[Integer.parseInt(data)] = data;
//    }

    public void add(String s, int i) {
        data = s;
        index = i;
    }
}
