package FinalKwordExample;



public class FinalKwordTest {

    public static void main(String[] args) {
        final int num1 = 150;
        System.out.println(num1);

        Empleado employee = new Empleado();

        employee.sayHelloTo("Jorge");
        employee.sayHelloToNotFinal("Jorge2");

        //num1 = 20; error
    }
}
