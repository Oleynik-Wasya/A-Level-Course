package level2;

public class Main {
    public static void main(String[] args) {
        System.out.println(1);
        Bracket bracket = new Bracket();
        boolean res = bracket.isBracketsPossible("([{()}])");
        System.out.println(res);

        MyBinaryTree myBinaryTree = new MyBinaryTree(0);
        myBinaryTree.left = new MyBinaryTree(1);
        myBinaryTree.right = new MyBinaryTree(2);
        myBinaryTree.right.right = new MyBinaryTree(3);


        System.out.println(new BinaryTree().size(myBinaryTree, 0));
    }
}
