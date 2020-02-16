package level2;

public class BinaryTree {
    int size(MyBinaryTree tree, int depth){
        if (tree == null){
            return depth;
        }
        return Math.max(size(tree.left, depth + 1), size(tree.right, depth + 1));
    }
}
