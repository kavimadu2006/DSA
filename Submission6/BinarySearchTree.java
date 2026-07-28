class Node {

    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        root = null;
    }

    Node insert(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insert(root.left, key);

        else if (key > root.key)
            root.right = insert(root.right, key);

        return root;
    }

    void insert(int key) {
        root = insert(root, key);
    }

    void inorder(Node root) {

        if (root != null) {

            inorder(root.left);

            System.out.print(root.key + " ");

            inorder(root.right);
        }
    }

    void preorder(Node root) {

        if (root != null) {

            System.out.print(root.key + " ");

            preorder(root.left);

            preorder(root.right);

        }
    }

    void postorder(Node root) {

        if (root != null) {

            postorder(root.left);

            postorder(root.right);

            System.out.print(root.key + " ");

        }
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);

        System.out.println();

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);

        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);

    }
}
