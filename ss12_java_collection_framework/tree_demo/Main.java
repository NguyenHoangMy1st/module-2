package ss12_java_collection_framework.tree_demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BST tree = new BST();

        // Inserting elements
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal:");
        tree.inorder();

        // Deleting elements
        tree.delete(20);
        tree.delete(30);

        System.out.println("Inorder traversal after deletion:");
        tree.inorder();

        // Searching for an element
        int searchKey = 70;
        System.out.println("Is " + searchKey + " present in the tree? " + tree.search(searchKey));

        // Traversals
        System.out.println("Preorder traversal:");
        tree.preorder();

        System.out.println("Postorder traversal:");
        tree.postorder();
    }
}