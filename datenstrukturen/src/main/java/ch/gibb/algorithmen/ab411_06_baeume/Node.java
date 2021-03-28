package ch.gibb.algorithmen.ab411_06_baeume;

public class Node {

    protected Comparable value;
    protected Node right;
    protected Node left;


    public Node(Comparable value, Node right, Node left) {
        this.value = value;
        this.right = right;
        this.left = left;
    }
}
