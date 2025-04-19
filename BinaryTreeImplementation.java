public class BinaryTreeImplementation {
    public static void main(String[] args) {
        CustomBinaryTree tree = new CustomBinaryTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        System.out.println("Size of the tree: " + tree.size());
        System.out.println("Contains 10: " + tree.contains(10));
        System.out.println("Contains 20: " + tree.contains(20));

        System.out.println("In-order traversal:");
        tree.inOrderTraversal();

        System.out.println("Pre-order traversal:");
        tree.preOrderTraversal();

        System.out.println("Post-order traversal:");
        tree.postOrderTraversal();
    }
}
