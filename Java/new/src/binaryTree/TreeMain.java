package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreeMain {

    public static void main(String[] args) {

       BinaryTree<Integer> myTree = new BinaryTree<Integer>();

       myTree.insert(5);
       myTree.insert(3);
       myTree.insert(8);
       myTree.insert(2);
       myTree.insert(4);
       /*myTree.inorder();
       System.out.println("\n");
       myTree.preOrder();
       System.out.println("\n");
       myTree.postOrder();*/
       System.out.println(myTree.isLeaf(4));
       combinations();

    }

    public static void combinations (){
        int[] numbers = {1,2,3};
        var myHolder = new ArrayList<ArrayList<Integer>>();
        combinations(new ArrayList<Integer>(), myHolder, numbers);

        myHolder.forEach(System.out::println);


    }

    public static void combinations (List<Integer> temp, List<ArrayList<Integer>> holder, int[] nums){

        if(temp.size() == nums.length){
            var aux = new ArrayList<>(temp);
            holder.add(aux);
            return;
        }
        for (int current : nums) {
            if (temp.contains(current)) {
                continue;
            }
            else {
                temp.add(current);
                combinations(temp, holder, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }

}
