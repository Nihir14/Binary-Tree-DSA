public class BinarySearchTreeImplementation {
    public static void main(String[] args) {
        CustomBinarySearchTree tree = new CustomBinarySearchTree();

        // Insert values into the BST
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Perform traversals
        System.out.println("In-order traversal:");
        tree.inorder();

        System.out.println("Pre-order traversal:");
        tree.preorder();

        System.out.println("Post-order traversal:");
        tree.postorder();

        // Search for a value
        System.out.println("Search for 40: " + tree.search(40));
        System.out.println("Search for 90: " + tree.search(90));

        // Delete a value
        System.out.println("Deleting 20...");
        tree.delete(20);
        System.out.println("In-order traversal after deletion:");
        tree.inorder();
    }
}