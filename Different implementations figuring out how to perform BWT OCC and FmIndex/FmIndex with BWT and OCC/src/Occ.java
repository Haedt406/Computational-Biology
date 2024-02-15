public class Occ {
    private int length;
    public char data;
    public Occ(char relatedchar, int length) {
        this.data = relatedchar;
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public char getChar(){
        return data;
    }

    public void printOcc(){
        System.out.println("Character: " + data + " K: " + length);
    }

//    public void printOccTable{
//        for (int i = 0; i < )
//    }
}
