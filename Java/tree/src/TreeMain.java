import java.util.Stack;

public class TreeMain {

    public static void main(String[] args) {

       BinaryTree<Integer> myTree = new BinaryTree<Integer>();

       myTree.insert(5);
       myTree.insert(8);
       myTree.insert(2);
       myTree.insert(12);

       //System.out.println(myTree.height());
       //System.out.println(myTree.search(12));
      // System.out.println(myTree.isLeaf(8));
        myTree.inorder();
      // System.out.println(makeGood("abBAcC"));
        String[] words = {"flower","flow","flight"};
      System.out.println(commonPrefix(words));




    }

    public static String makeGood(String s) {
        Stack<Character> holder = new Stack<>();
        String newOne = "";

        for(int i = 0; i < s.length(); i++){
            if(holder.isEmpty()){
              holder.push(s.charAt(i));
            }
            else{
                char current = holder.peek();
                char param = Character.isUpperCase(current) ? Character.toLowerCase(current) : Character.toUpperCase(current);

                if(s.charAt(i) == param){
                    holder.pop();
                }

                else{
                    holder.push(s.charAt(i));
                }
            }
        }

        while (!holder.isEmpty()){
            newOne += holder.pop().toString();
        }

        StringBuilder sb=new StringBuilder(newOne);
        sb.reverse();

        return sb.toString();
    }

    public static String commonPrefix(String[] strs){

        if(strs.length == 0){
            return "";
        }
        String reference = strs[0];

        for(int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(reference) != 0){
                reference = reference.substring(0, reference.length()-1);
                if(reference.length() == 0){
                    return "";
                }
            }
        }
        return reference;
    }




}
