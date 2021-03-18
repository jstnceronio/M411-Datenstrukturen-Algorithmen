package ch.gibb.algorithmen.ab411_06_trees;

/**
 * Java BinaryTree from https://www.baeldung.com/java-binary-tree.
 */
public class BinaryTree {

    // root node
    Node root;

    /**
     * Initializes example BinaryTree.
     * @return completed tree.
     */
    public static BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        return bt;
    }

    /**
     * Uses recursion to add Nodes with value to tree.
     * @param current node index
     * @param value value of node
     * @return current node
     */
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    /**
     * Method to start recursion.
     * @param value of node
     */
    public void add(int value) {
        root = addRecursive(root, value);
    }

    /**
     * Uses recursion to find element in tree.
     * @param current
     * @param value
     * @return
     */
    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    /**
     * Method to start recursion
     * @param value
     * @return
     */
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public void traverse() {
        traversePreOrder(root);
    }

    /**
     * Starts with Root, then left Subtree, then finally the right one.
     * @param node
     */
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
