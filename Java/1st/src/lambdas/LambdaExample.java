package lambdas;

import java.util.ArrayList;

public class LambdaExample {

    public static void main(String[] args) {

        //https://www.geeksforgeeks.org/lambda-expressions-java-8/

        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(5);
        myArray.add(2);
        myArray.add(1);
        myArray.add(6);
        myArray.add(7);

        ILambdaTest fObj = (int param) -> param*2;

        System.out.println(fObj.abstractFun(4));

        // we can use lambdas to implement interfaces like the one up or foreach that gives us
        // a consumer

        // instead of creating a fun that will take space we create a quick lambda
        myArray.forEach((num) -> {if(num %2 == 0)
            System.out.println(num);
        });

    }
}


