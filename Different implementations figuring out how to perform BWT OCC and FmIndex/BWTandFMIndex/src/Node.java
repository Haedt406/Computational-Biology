import java.util.ArrayList;
import java.util.List;

public class Node {
    private String text;
    private List<Node> children;
    private int position;

    public Node(String word, int position) {
        this.text = word;
        this.position = position;
        this.children = new ArrayList<>();
    }


    // getters, setters, toString()
}