package level2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    BinaryTree binaryTree;

    @BeforeEach
    void setUp(){
        binaryTree = new BinaryTree();
    }

    @Test
    void testBinaryTree(){
        MyBinaryTree myBinaryTree1 = new MyBinaryTree(0);
        myBinaryTree1.left = new MyBinaryTree(1);
        myBinaryTree1.right = new MyBinaryTree(2);
        myBinaryTree1.right.right = new MyBinaryTree(3);
        assertSize(3, binaryTree.size(myBinaryTree1, 0));

        MyBinaryTree myBinaryTree2 = new MyBinaryTree(0);
        myBinaryTree2.left = new MyBinaryTree(5);
        myBinaryTree2.left = new MyBinaryTree(2);
        myBinaryTree2.left.left = new MyBinaryTree(1);
        assertSize(3, binaryTree.size(myBinaryTree2, 0));

        MyBinaryTree myBinaryTree3 = new MyBinaryTree(0);
        myBinaryTree3.left = new MyBinaryTree(5);
        myBinaryTree3.left = new MyBinaryTree(3);
        myBinaryTree3.left.left = new MyBinaryTree(2);
        myBinaryTree3.left.left.left = new MyBinaryTree(1);
        assertSize(4, binaryTree.size(myBinaryTree3, 0));

    }

    void assertSize(int expected, int got){
        assertEquals(expected, got);
    }
}