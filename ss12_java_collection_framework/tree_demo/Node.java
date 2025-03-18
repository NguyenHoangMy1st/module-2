package ss12_java_collection_framework.tree_demo;

public class Node {
    protected int key;
    protected Node left;
    protected Node right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}
