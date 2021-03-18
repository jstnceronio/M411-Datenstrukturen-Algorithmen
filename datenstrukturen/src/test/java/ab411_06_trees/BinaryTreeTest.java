package ab411_06_trees;

import ch.gibb.algorithmen.ab411_06_trees.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryTreeTest {

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = BinaryTree.createBinaryTree();

        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));

        bt.traverse();
    }

    @Test
    public void buildTree() {
        BinaryTree bt;
    }
}
