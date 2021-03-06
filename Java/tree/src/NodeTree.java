public class NodeTree<T> {

    private T value;
    private NodeTree<T> left;
    private NodeTree<T> right;

    public NodeTree(T value, NodeTree<T> left, NodeTree<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    //region setters and getters
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeTree<T> getLeft() {
        return left;
    }

    public void setLeft(NodeTree<T> left) {
        this.left = left;
    }

    public NodeTree<T> getRight() {
        return right;
    }

    public void setRight(NodeTree<T> right) {
        this.right = right;
    }

    // endregion


    @Override
    public String toString() {
        return "NodeTree{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
