import java.util.ArrayList;
import java.util.List;

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

   private NodeTree<T> insert(T element, NodeTree<T> node){
        if(node == null){
            return new NodeTree<>(element, null, null);
        }
        else{
            //System.out.println(node.getValue());
            if(element.doubleValue() < node.getValue().doubleValue()){
                node.setLeft(insert(element,node.getLeft()));
            }
            else{
                node.setRight(insert(element,node.getRight()));
            }
        }
        return node;
    }

    public int height(){
        return height(root);
    }

    private int height(NodeTree<T> root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.getLeft());
        int rightHeight = height(root.getRight());

        return 1 + (Math.max(leftHeight, rightHeight));
    }

    public NodeTree<T> search(T element){
        return search(element, root);
    }

    private NodeTree<T> search(T element, NodeTree<T> root){
        if(root == null){
            return null;
        }
        if(element.doubleValue() == root.getValue().doubleValue()){
            return root;
        }
        else if(element.doubleValue() > root.getValue().doubleValue()){
            return search(element,root.getRight());
        }
        else {
            return search(element,root.getLeft());
        }
    }

    public Boolean isLeaf(T element){
        NodeTree<T> node = search(element, root);

        if(node == null){
            return false;
        }
        return  (node.getLeft() == null && node.getRight() == null);
    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(NodeTree<T> root){
        if(root == null){
            return;
        }

        inorder(root.getLeft());
        System.out.println(root.getValue());
        inorder(root.getRight());
    }

    public void preorder(){
        preorder(root);
    }

    private void preorder(NodeTree<T> root){
        if(root == null){
            return;
        }

        System.out.println(root.getValue());
        inorder(root.getLeft());
        inorder(root.getRight());
    }



}
