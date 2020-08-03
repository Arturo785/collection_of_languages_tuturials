package Exceptions;

public class TestException {


    public static void main(String[] args) {

        try {
            System.out.println(division(4,1));
            System.out.println(division(4,0));

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Final");
        }

    }

    public static int division(int numerador, int denominador) throws CustomException{
        if(denominador == 0){
            throw new CustomException("Division by zero");
        }
        return  numerador/denominador;
    }
}
