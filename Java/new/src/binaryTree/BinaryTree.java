package binaryTree;


public class BinaryTree<T extends Number> {

    private NodeTree<T> root;

    public BinaryTree(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(T element){
        root = insert(element, root);
    }

   private NodeTree<T> insert (T element, NodeTree<T> node){
        if(node == null){
            return new NodeTree<>(element, null, null);
        }
        else{
            if(element.doubleValue() < node.getValue().doubleValue()){
                node.setLeft(insert(element,node.getLeft()));
            }
            else{
                node.setRight(insert(element,node.getRight()));
            }
        }
        return node;
    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(NodeTree<T> node) {
        if(node == null){
            return;
        }
        inorder(node.getLeft());
        System.out.println(node.getValue());
        inorder(node.getRight());
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(NodeTree<T> node) {
        if(node == null){
            return;
        }

        System.out.println(node.getValue());
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(NodeTree<T> node) {
        if(node == null){
            return;
        }

        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.println(node.getValue());
    }

    public boolean isLeaf(T element){
        NodeTree <T> node = isLeaf(root, element);

        if(node == null){
            return false;
        }
        return node.getLeft() == null && node.getRight() == null;
    }

    private NodeTree<T> isLeaf(NodeTree<T> node,T element) {
        if(node == null){
            return null;
        }
        if(node.getValue().equals(element)){
            return node;
        }
        else if(element.doubleValue() < node.getValue().doubleValue()){
           return isLeaf(node.getLeft(), element);
        }
        else{
           return isLeaf(node.getRight(), element);
        }
    }


}
