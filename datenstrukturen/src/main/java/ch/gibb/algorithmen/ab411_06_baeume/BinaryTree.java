package ch.gibb.algorithmen.ab411_06_baeume;

public class BinaryTree {

    protected Node root;


    public BinaryTree(Node root) {
        this.root = root;
    }

    public void insert(Comparable value) {

        Node temp = root;
        Node parent = null;

        while (temp != null) {
            parent = temp;

            if (value.compareTo(temp.value) < 0) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        if (parent != null) {
            if (value.compareTo(parent.value) > 0) {
                parent.right = new Node(value, null, null);
            }  else  {
                parent.left = new Node(value, null, null);
            }
        }
    }
}
