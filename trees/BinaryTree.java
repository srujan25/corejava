package trees;

/**
 * Created by SG0221519 on 6/14/2017.
 */
public class BinaryTree {
    Node root;
    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(100);
        bt.root.right = new Node(200);
        bt.root.left.left = new Node(1000);
        bt.root.left.right = new Node(2000);
        System.out.println(bt.root);
    }
}
