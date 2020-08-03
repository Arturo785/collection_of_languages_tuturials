package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Interviews {

    public static void main(String[] args) {
        System.out.println(spyCode("1045892500"));
        casaAlgorithm("casa");

    }

    private static boolean spyCode(String message){
        Stack<Character> checker = new Stack<>();

        checker.push('7');
        checker.push('0');
        checker.push('0');

        for (Character myChar: message.toCharArray()) {
            if(checker.size() == 0){
                break;
            }

            if(myChar == checker.peek()){
                checker.pop();
            }

        }
        return checker.size() == 0;
    }
    
    private static void casaAlgorithm(String message){
        Map<Character, Integer> repeated = new HashMap<>();

        for (char caracter : message.toCharArray()) {
            if(repeated.containsKey(caracter)){
                repeated.put(caracter, repeated.get(caracter)+1);
            }
            else{
                repeated.put(caracter,1);
            }
        }

        repeated.entrySet().forEach( element ->{
            System.out.println(element);
        });
    }
}
