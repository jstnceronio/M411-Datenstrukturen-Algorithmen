package ch.gibb.algorithmen.ab411_06_trees;

/**
 * Java Node from https://www.baeldung.com/java-binary-tree.
 */
public class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
