class Node {
    int value;
    Node left,right;

    public Node(int item) {
        this.value = item;
        left = null;
        right = null;
    }
}

public class CustomBinarySearchTree {
    Node root;

    public CustomBinarySearchTree() {
        root = null;
    }

    void insert(int item) {
        root = insertRec(root, item);
    }

    // insertion
    private Node insertRec(Node root, int item) {
        if (root == null) {
            root = new Node(item);
            return root;
        }
        if (item < root.value) {
            root.left = insertRec(root.left, item);
        } else if (item > root.value) {
            root.right = insertRec(root.right, item);
        }
        return root;
    }

    void delete(int item) {
        root = deleteRec(root, item);
    }

    private Node deleteRec(Node root, int item) {
        if (root == null) {
            return root;
        }

        if (item < root.value) {
            root.left = deleteRec(root.left, item);
        } else if(item > root.value) {
            root.right = deleteRec(root.right, item);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.value = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.value);
        }
        return root;
    }
    int minValue(Node root) {
        int minv = root.value;
        while (root.left != null) {
            minv = root.left.value;
            root = root.left;
        }
        return minv;
    }

    // Search operation
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null)
            return false;
        if (root.value == key)
            return true;
        if (root.value < key)
            return searchRec(root.right, key);
        return searchRec(root.left, key);
    }

    // Inorder traversal
    void inorder() {
        inorderRec(root);
        System.out.println("\n");
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    // Preorder traversal
    void preorder() {
        preorderRec(root);
        System.out.println("\n");

    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Postorder traversal
    void postorder() {
        postorderRec(root);
        System.out.println("\n");
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.value + " ");
        }
    }
}
